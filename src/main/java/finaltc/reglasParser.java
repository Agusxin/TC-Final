// Generated from c:/Users/Agux/Desktop/DefinitivoTC/finaltc/src/main/java/finaltc/reglas.g4 by ANTLR 4.13.1

package finaltc;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class reglasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVEA=1, LLAVEC=2, PARENA=3, PARENC=4, INT=5, DOUBLE=6, VOID=7, FLOAT=8, 
		WHILE=9, IIF=10, IElse=11, IFOR=12, MAS=13, MENOS=14, MULT=15, DIV=16, 
		MENOR=17, MAYOR=18, MENORIGUAL=19, MAYORIGUAL=20, IGUALES=21, DISTINTO=22, 
		INCREMENTO=23, DECREMENTO=24, ASIG=25, PYC=26, COMA=27, OR=28, AND=29, 
		NOT=30, TRUE=31, FALSE=32, RETURN=33, ENTERO=34, ID=35, WS=36;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_bloque = 2, RULE_instruccion = 3, 
		RULE_declaracion = 4, RULE_tipo_de_datos = 5, RULE_asignar = 6, RULE_asignacion = 7, 
		RULE_opal = 8, RULE_exprLog = 9, RULE_exprOR = 10, RULE_o = 11, RULE_and = 12, 
		RULE_a = 13, RULE_comp = 14, RULE_c = 15, RULE_exp = 16, RULE_e = 17, 
		RULE_term = 18, RULE_t = 19, RULE_factor = 20, RULE_f = 21, RULE_logico_comp = 22, 
		RULE_comparacion = 23, RULE_iwhile = 24, RULE_iif = 25, RULE_ifor = 26, 
		RULE_parametros_funcion = 27, RULE_definicion_funcion = 28, RULE_argumentos_funcion = 29, 
		RULE_llamada_funcion = 30, RULE_finalizar_con_return = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "bloque", "instruccion", "declaracion", 
			"tipo_de_datos", "asignar", "asignacion", "opal", "exprLog", "exprOR", 
			"o", "and", "a", "comp", "c", "exp", "e", "term", "t", "factor", "f", 
			"logico_comp", "comparacion", "iwhile", "iif", "ifor", "parametros_funcion", 
			"definicion_funcion", "argumentos_funcion", "llamada_funcion", "finalizar_con_return"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'int'", "'double'", "'void'", "'float'", 
			"'while'", "'if'", "'else'", "'for'", "'+'", "'-'", "'*'", "'/'", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'++'", "'--'", "'='", "';'", 
			"','", "'||'", "'&&'", "'!'", "'true'", "'false'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "DOUBLE", "VOID", 
			"FLOAT", "WHILE", "IIF", "IElse", "IFOR", "MAS", "MENOS", "MULT", "DIV", 
			"MENOR", "MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUALES", "DISTINTO", 
			"INCREMENTO", "DECREMENTO", "ASIG", "PYC", "COMA", "OR", "AND", "NOT", 
			"TRUE", "FALSE", "RETURN", "ENTERO", "ID", "WS"
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
	public String getGrammarFileName() { return "reglas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public reglasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			instrucciones();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case VOID:
			case FLOAT:
			case WHILE:
			case IIF:
			case IFOR:
			case RETURN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				instruccion();
				setState(67);
				instrucciones();
				}
				break;
			case LLAVEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				bloque();
				setState(70);
				instrucciones();
				}
				break;
			case EOF:
			case LLAVEC:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVEA() { return getToken(reglasParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(reglasParser.LLAVEC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LLAVEA);
			setState(76);
			instrucciones();
			setState(77);
			match(LLAVEC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(reglasParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public Definicion_funcionContext definicion_funcion() {
			return getRuleContext(Definicion_funcionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public Finalizar_con_returnContext finalizar_con_return() {
			return getRuleContext(Finalizar_con_returnContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				declaracion();
				setState(80);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				asignacion();
				setState(83);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				iwhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				iif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				ifor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				definicion_funcion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				llamada_funcion();
				setState(90);
				match(PYC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				finalizar_con_return();
				setState(93);
				match(PYC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public AsignarContext asignar() {
			return getRuleContext(AsignarContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				tipo_de_datos();
				setState(98);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				tipo_de_datos();
				setState(101);
				match(ID);
				setState(102);
				asignar();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_de_datosContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(reglasParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(reglasParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(reglasParser.FLOAT, 0); }
		public TerminalNode VOID() { return getToken(reglasParser.VOID, 0); }
		public Tipo_de_datosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_datos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterTipo_de_datos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitTipo_de_datos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitTipo_de_datos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_de_datosContext tipo_de_datos() throws RecognitionException {
		Tipo_de_datosContext _localctx = new Tipo_de_datosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo_de_datos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignarContext extends ParserRuleContext {
		public TerminalNode ASIG() { return getToken(reglasParser.ASIG, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public AsignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterAsignar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitAsignar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitAsignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarContext asignar() throws RecognitionException {
		AsignarContext _localctx = new AsignarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ASIG);
			setState(109);
			opal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public AsignarContext asignar() {
			return getRuleContext(AsignarContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			asignar();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpalContext extends ParserRuleContext {
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterOpal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitOpal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitOpal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			exprLog();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogContext extends ParserRuleContext {
		public ExprORContext exprOR() {
			return getRuleContext(ExprORContext.class,0);
		}
		public ExprLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogContext exprLog() throws RecognitionException {
		ExprLogContext _localctx = new ExprLogContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprLog);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENA:
			case MAS:
			case MENOS:
			case INCREMENTO:
			case DECREMENTO:
			case NOT:
			case ENTERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				exprOR();
				}
				break;
			case PARENC:
			case PYC:
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprORContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public ExprORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExprOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExprOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExprOR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprORContext exprOR() throws RecognitionException {
		ExprORContext _localctx = new ExprORContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprOR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			and();
			setState(121);
			o();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(reglasParser.OR, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public OContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_o);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(OR);
				setState(124);
				and();
				setState(125);
				o();
				}
				break;
			case PARENC:
			case PYC:
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ParserRuleContext {
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			comp();
			setState(131);
			a();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(reglasParser.AND, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_a);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(AND);
				setState(134);
				comp();
				setState(135);
				a();
				}
				break;
			case PARENC:
			case PYC:
			case COMA:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			exp();
			setState(141);
			c();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CContext extends ParserRuleContext {
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_c);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
			case MAYOR:
			case MENORIGUAL:
			case MAYORIGUAL:
			case IGUALES:
			case DISTINTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				comparacion();
				setState(144);
				exp();
				}
				break;
			case PARENC:
			case PYC:
			case COMA:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			term();
			setState(150);
			e();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(reglasParser.MAS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(reglasParser.MENOS, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_e);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(MAS);
				setState(153);
				term();
				setState(154);
				e();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(MENOS);
				setState(157);
				term();
				setState(158);
				e();
				}
				break;
			case PARENC:
			case MENOR:
			case MAYOR:
			case MENORIGUAL:
			case MAYORIGUAL:
			case IGUALES:
			case DISTINTO:
			case PYC:
			case COMA:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			factor();
			setState(164);
			t();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(reglasParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIV() { return getToken(reglasParser.DIV, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_t);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(MULT);
				setState(167);
				factor();
				setState(168);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(DIV);
				setState(171);
				factor();
				setState(172);
				t();
				}
				break;
			case PARENC:
			case MAS:
			case MENOS:
			case MENOR:
			case MAYOR:
			case MENORIGUAL:
			case MAYORIGUAL:
			case IGUALES:
			case DISTINTO:
			case PYC:
			case COMA:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(reglasParser.ENTERO, 0); }
		public TerminalNode PARENA() { return getToken(reglasParser.PARENA, 0); }
		public ExprLogContext exprLog() {
			return getRuleContext(ExprLogContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(reglasParser.PARENC, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				f();
				setState(178);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				f();
				setState(181);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				f();
				setState(184);
				match(PARENA);
				setState(185);
				exprLog();
				setState(186);
				match(PARENC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				f();
				setState(189);
				llamada_funcion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(ID);
				setState(192);
				f();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(reglasParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(reglasParser.MENOS, 0); }
		public TerminalNode NOT() { return getToken(reglasParser.NOT, 0); }
		public TerminalNode INCREMENTO() { return getToken(reglasParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(reglasParser.DECREMENTO, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_f);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(MAS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(MENOS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(NOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(INCREMENTO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(DECREMENTO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logico_compContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(reglasParser.OR, 0); }
		public TerminalNode AND() { return getToken(reglasParser.AND, 0); }
		public Logico_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterLogico_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitLogico_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitLogico_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logico_compContext logico_comp() throws RecognitionException {
		Logico_compContext _localctx = new Logico_compContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logico_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(reglasParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(reglasParser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(reglasParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(reglasParser.MENORIGUAL, 0); }
		public TerminalNode IGUALES() { return getToken(reglasParser.IGUALES, 0); }
		public TerminalNode DISTINTO() { return getToken(reglasParser.DISTINTO, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(reglasParser.WHILE, 0); }
		public TerminalNode PARENA() { return getToken(reglasParser.PARENA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(reglasParser.PARENC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(WHILE);
			setState(208);
			match(PARENA);
			setState(209);
			opal();
			setState(210);
			match(PARENC);
			setState(211);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IifContext extends ParserRuleContext {
		public TerminalNode IIF() { return getToken(reglasParser.IIF, 0); }
		public TerminalNode PARENA() { return getToken(reglasParser.PARENA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(reglasParser.PARENC, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode IElse() { return getToken(reglasParser.IElse, 0); }
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterIif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitIif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitIif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_iif);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(IIF);
				setState(214);
				match(PARENA);
				setState(215);
				opal();
				setState(216);
				match(PARENC);
				setState(217);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(IIF);
				setState(220);
				match(PARENA);
				setState(221);
				opal();
				setState(222);
				match(PARENC);
				setState(223);
				bloque();
				setState(224);
				match(IElse);
				setState(225);
				bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IforContext extends ParserRuleContext {
		public TerminalNode IFOR() { return getToken(reglasParser.IFOR, 0); }
		public TerminalNode PARENA() { return getToken(reglasParser.PARENA, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> PYC() { return getTokens(reglasParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(reglasParser.PYC, i);
		}
		public List<OpalContext> opal() {
			return getRuleContexts(OpalContext.class);
		}
		public OpalContext opal(int i) {
			return getRuleContext(OpalContext.class,i);
		}
		public TerminalNode PARENC() { return getToken(reglasParser.PARENC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterIfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitIfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitIfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IFOR);
			setState(230);
			match(PARENA);
			setState(231);
			asignacion();
			setState(232);
			match(PYC);
			setState(233);
			opal();
			setState(234);
			match(PYC);
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(235);
				asignacion();
				}
				break;
			case 2:
				{
				setState(236);
				opal();
				}
				break;
			}
			setState(239);
			match(PARENC);
			setState(240);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parametros_funcionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode COMA() { return getToken(reglasParser.COMA, 0); }
		public Parametros_funcionContext parametros_funcion() {
			return getRuleContext(Parametros_funcionContext.class,0);
		}
		public Parametros_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterParametros_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitParametros_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitParametros_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_funcionContext parametros_funcion() throws RecognitionException {
		Parametros_funcionContext _localctx = new Parametros_funcionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parametros_funcion);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				tipo_de_datos();
				setState(243);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				tipo_de_datos();
				setState(246);
				match(ID);
				setState(247);
				match(COMA);
				setState(248);
				parametros_funcion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Definicion_funcionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode PARENA() { return getToken(reglasParser.PARENA, 0); }
		public Parametros_funcionContext parametros_funcion() {
			return getRuleContext(Parametros_funcionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(reglasParser.PARENC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Definicion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterDefinicion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitDefinicion_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitDefinicion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcionContext definicion_funcion() throws RecognitionException {
		Definicion_funcionContext _localctx = new Definicion_funcionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_definicion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			tipo_de_datos();
			setState(254);
			match(ID);
			setState(255);
			match(PARENA);
			setState(256);
			parametros_funcion();
			setState(257);
			match(PARENC);
			setState(258);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Argumentos_funcionContext extends ParserRuleContext {
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode COMA() { return getToken(reglasParser.COMA, 0); }
		public Argumentos_funcionContext argumentos_funcion() {
			return getRuleContext(Argumentos_funcionContext.class,0);
		}
		public Argumentos_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterArgumentos_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitArgumentos_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitArgumentos_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argumentos_funcionContext argumentos_funcion() throws RecognitionException {
		Argumentos_funcionContext _localctx = new Argumentos_funcionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_argumentos_funcion);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				opal();
				setState(261);
				match(COMA);
				setState(262);
				argumentos_funcion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				opal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(reglasParser.ID, 0); }
		public TerminalNode PARENA() { return getToken(reglasParser.PARENA, 0); }
		public Argumentos_funcionContext argumentos_funcion() {
			return getRuleContext(Argumentos_funcionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(reglasParser.PARENC, 0); }
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitLlamada_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ID);
			setState(269);
			match(PARENA);
			setState(270);
			argumentos_funcion();
			setState(271);
			match(PARENC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Finalizar_con_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(reglasParser.RETURN, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public Finalizar_con_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalizar_con_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).enterFinalizar_con_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasListener ) ((reglasListener)listener).exitFinalizar_con_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reglasVisitor ) return ((reglasVisitor<? extends T>)visitor).visitFinalizar_con_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finalizar_con_returnContext finalizar_con_return() throws RecognitionException {
		Finalizar_con_returnContext _localctx = new Finalizar_con_returnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_finalizar_con_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(RETURN);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(274);
				opal();
				}
				break;
			case 2:
				{
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

	public static final String _serializedATN =
		"\u0004\u0001$\u0117\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"J\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004i\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0003\tw\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0081\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u008b"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0094\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a2\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00b0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00c2\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00ca\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00e4\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u00ee\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00fc\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u010b\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0115"+
		"\b\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000"+
		"\u0003\u0001\u0000\u0005\b\u0001\u0000\u001c\u001d\u0001\u0000\u0011\u0016"+
		"\u0118\u0000@\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004"+
		"K\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\bh\u0001\u0000"+
		"\u0000\u0000\nj\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000e"+
		"o\u0001\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012v\u0001"+
		"\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000"+
		"\u0000\u0000\u0018\u0082\u0001\u0000\u0000\u0000\u001a\u008a\u0001\u0000"+
		"\u0000\u0000\u001c\u008c\u0001\u0000\u0000\u0000\u001e\u0093\u0001\u0000"+
		"\u0000\u0000 \u0095\u0001\u0000\u0000\u0000\"\u00a1\u0001\u0000\u0000"+
		"\u0000$\u00a3\u0001\u0000\u0000\u0000&\u00af\u0001\u0000\u0000\u0000("+
		"\u00c1\u0001\u0000\u0000\u0000*\u00c9\u0001\u0000\u0000\u0000,\u00cb\u0001"+
		"\u0000\u0000\u0000.\u00cd\u0001\u0000\u0000\u00000\u00cf\u0001\u0000\u0000"+
		"\u00002\u00e3\u0001\u0000\u0000\u00004\u00e5\u0001\u0000\u0000\u00006"+
		"\u00fb\u0001\u0000\u0000\u00008\u00fd\u0001\u0000\u0000\u0000:\u010a\u0001"+
		"\u0000\u0000\u0000<\u010c\u0001\u0000\u0000\u0000>\u0111\u0001\u0000\u0000"+
		"\u0000@A\u0003\u0002\u0001\u0000A\u0001\u0001\u0000\u0000\u0000BC\u0003"+
		"\u0006\u0003\u0000CD\u0003\u0002\u0001\u0000DJ\u0001\u0000\u0000\u0000"+
		"EF\u0003\u0004\u0002\u0000FG\u0003\u0002\u0001\u0000GJ\u0001\u0000\u0000"+
		"\u0000HJ\u0001\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000IE\u0001\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0003\u0001\u0000\u0000\u0000"+
		"KL\u0005\u0001\u0000\u0000LM\u0003\u0002\u0001\u0000MN\u0005\u0002\u0000"+
		"\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0005\u001a"+
		"\u0000\u0000Q`\u0001\u0000\u0000\u0000RS\u0003\u000e\u0007\u0000ST\u0005"+
		"\u001a\u0000\u0000T`\u0001\u0000\u0000\u0000U`\u00030\u0018\u0000V`\u0003"+
		"2\u0019\u0000W`\u00034\u001a\u0000X`\u00038\u001c\u0000YZ\u0003<\u001e"+
		"\u0000Z[\u0005\u001a\u0000\u0000[`\u0001\u0000\u0000\u0000\\]\u0003>\u001f"+
		"\u0000]^\u0005\u001a\u0000\u0000^`\u0001\u0000\u0000\u0000_O\u0001\u0000"+
		"\u0000\u0000_R\u0001\u0000\u0000\u0000_U\u0001\u0000\u0000\u0000_V\u0001"+
		"\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000_X\u0001\u0000\u0000\u0000"+
		"_Y\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000`\u0007\u0001\u0000"+
		"\u0000\u0000ab\u0003\n\u0005\u0000bc\u0005#\u0000\u0000ci\u0001\u0000"+
		"\u0000\u0000de\u0003\n\u0005\u0000ef\u0005#\u0000\u0000fg\u0003\f\u0006"+
		"\u0000gi\u0001\u0000\u0000\u0000ha\u0001\u0000\u0000\u0000hd\u0001\u0000"+
		"\u0000\u0000i\t\u0001\u0000\u0000\u0000jk\u0007\u0000\u0000\u0000k\u000b"+
		"\u0001\u0000\u0000\u0000lm\u0005\u0019\u0000\u0000mn\u0003\u0010\b\u0000"+
		"n\r\u0001\u0000\u0000\u0000op\u0005#\u0000\u0000pq\u0003\f\u0006\u0000"+
		"q\u000f\u0001\u0000\u0000\u0000rs\u0003\u0012\t\u0000s\u0011\u0001\u0000"+
		"\u0000\u0000tw\u0003\u0014\n\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vu\u0001\u0000\u0000\u0000w\u0013\u0001\u0000\u0000\u0000"+
		"xy\u0003\u0018\f\u0000yz\u0003\u0016\u000b\u0000z\u0015\u0001\u0000\u0000"+
		"\u0000{|\u0005\u001c\u0000\u0000|}\u0003\u0018\f\u0000}~\u0003\u0016\u000b"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000"+
		"\u0080{\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0017\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u001c\u000e\u0000\u0083"+
		"\u0084\u0003\u001a\r\u0000\u0084\u0019\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u001d\u0000\u0000\u0086\u0087\u0003\u001c\u000e\u0000\u0087\u0088"+
		"\u0003\u001a\r\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u008b\u0001"+
		"\u0000\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u001b\u0001\u0000\u0000\u0000\u008c\u008d\u0003"+
		" \u0010\u0000\u008d\u008e\u0003\u001e\u000f\u0000\u008e\u001d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0003.\u0017\u0000\u0090\u0091\u0003 \u0010\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000"+
		"\u0093\u008f\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u001f\u0001\u0000\u0000\u0000\u0095\u0096\u0003$\u0012\u0000\u0096"+
		"\u0097\u0003\"\u0011\u0000\u0097!\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\r\u0000\u0000\u0099\u009a\u0003$\u0012\u0000\u009a\u009b\u0003"+
		"\"\u0011\u0000\u009b\u00a2\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u000e"+
		"\u0000\u0000\u009d\u009e\u0003$\u0012\u0000\u009e\u009f\u0003\"\u0011"+
		"\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a1\u0098\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2#\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0003(\u0014\u0000\u00a4\u00a5\u0003&\u0013\u0000\u00a5%"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u000f\u0000\u0000\u00a7\u00a8"+
		"\u0003(\u0014\u0000\u00a8\u00a9\u0003&\u0013\u0000\u00a9\u00b0\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\u0010\u0000\u0000\u00ab\u00ac\u0003(\u0014"+
		"\u0000\u00ac\u00ad\u0003&\u0013\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00a6\u0001\u0000\u0000\u0000"+
		"\u00af\u00aa\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\'\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003*\u0015\u0000\u00b2"+
		"\u00b3\u0005#\u0000\u0000\u00b3\u00c2\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0003*\u0015\u0000\u00b5\u00b6\u0005\"\u0000\u0000\u00b6\u00c2\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0003*\u0015\u0000\u00b8\u00b9\u0005\u0003"+
		"\u0000\u0000\u00b9\u00ba\u0003\u0012\t\u0000\u00ba\u00bb\u0005\u0004\u0000"+
		"\u0000\u00bb\u00c2\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003*\u0015\u0000"+
		"\u00bd\u00be\u0003<\u001e\u0000\u00be\u00c2\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005#\u0000\u0000\u00c0\u00c2\u0003*\u0015\u0000\u00c1\u00b1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00b4\u0001\u0000\u0000\u0000\u00c1\u00b7\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2)\u0001\u0000\u0000\u0000\u00c3\u00ca\u0005\r"+
		"\u0000\u0000\u00c4\u00ca\u0005\u000e\u0000\u0000\u00c5\u00ca\u0005\u001e"+
		"\u0000\u0000\u00c6\u00ca\u0005\u0017\u0000\u0000\u00c7\u00ca\u0005\u0018"+
		"\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c4\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca+\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0007\u0001\u0000\u0000\u00cc-\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0007\u0002\u0000\u0000\u00ce/\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\t\u0000\u0000\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d2"+
		"\u0003\u0010\b\u0000\u00d2\u00d3\u0005\u0004\u0000\u0000\u00d3\u00d4\u0003"+
		"\u0004\u0002\u0000\u00d41\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\n"+
		"\u0000\u0000\u00d6\u00d7\u0005\u0003\u0000\u0000\u00d7\u00d8\u0003\u0010"+
		"\b\u0000\u00d8\u00d9\u0005\u0004\u0000\u0000\u00d9\u00da\u0003\u0004\u0002"+
		"\u0000\u00da\u00e4\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\n\u0000\u0000"+
		"\u00dc\u00dd\u0005\u0003\u0000\u0000\u00dd\u00de\u0003\u0010\b\u0000\u00de"+
		"\u00df\u0005\u0004\u0000\u0000\u00df\u00e0\u0003\u0004\u0002\u0000\u00e0"+
		"\u00e1\u0005\u000b\u0000\u0000\u00e1\u00e2\u0003\u0004\u0002\u0000\u00e2"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e3\u00d5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00db\u0001\u0000\u0000\u0000\u00e43\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\f\u0000\u0000\u00e6\u00e7\u0005\u0003\u0000\u0000\u00e7\u00e8\u0003"+
		"\u000e\u0007\u0000\u00e8\u00e9\u0005\u001a\u0000\u0000\u00e9\u00ea\u0003"+
		"\u0010\b\u0000\u00ea\u00ed\u0005\u001a\u0000\u0000\u00eb\u00ee\u0003\u000e"+
		"\u0007\u0000\u00ec\u00ee\u0003\u0010\b\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0004\u0000\u0000\u00f0\u00f1\u0003\u0004\u0002"+
		"\u0000\u00f15\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003\n\u0005\u0000"+
		"\u00f3\u00f4\u0005#\u0000\u0000\u00f4\u00fc\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0003\n\u0005\u0000\u00f6\u00f7\u0005#\u0000\u0000\u00f7\u00f8"+
		"\u0005\u001b\u0000\u0000\u00f8\u00f9\u00036\u001b\u0000\u00f9\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f2\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f5\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc7\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003\n"+
		"\u0005\u0000\u00fe\u00ff\u0005#\u0000\u0000\u00ff\u0100\u0005\u0003\u0000"+
		"\u0000\u0100\u0101\u00036\u001b\u0000\u0101\u0102\u0005\u0004\u0000\u0000"+
		"\u0102\u0103\u0003\u0004\u0002\u0000\u01039\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0003\u0010\b\u0000\u0105\u0106\u0005\u001b\u0000\u0000\u0106\u0107"+
		"\u0003:\u001d\u0000\u0107\u010b\u0001\u0000\u0000\u0000\u0108\u010b\u0003"+
		"\u0010\b\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0104\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000"+
		"\u0000\u0000\u010b;\u0001\u0000\u0000\u0000\u010c\u010d\u0005#\u0000\u0000"+
		"\u010d\u010e\u0005\u0003\u0000\u0000\u010e\u010f\u0003:\u001d\u0000\u010f"+
		"\u0110\u0005\u0004\u0000\u0000\u0110=\u0001\u0000\u0000\u0000\u0111\u0114"+
		"\u0005!\u0000\u0000\u0112\u0115\u0003\u0010\b\u0000\u0113\u0115\u0001"+
		"\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0113\u0001"+
		"\u0000\u0000\u0000\u0115?\u0001\u0000\u0000\u0000\u0010I_hv\u0080\u008a"+
		"\u0093\u00a1\u00af\u00c1\u00c9\u00e3\u00ed\u00fb\u010a\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}