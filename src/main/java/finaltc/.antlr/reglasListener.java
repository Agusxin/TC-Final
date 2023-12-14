// Generated from c:/Users/Agux/Desktop/DefinitivoTC/finaltc/src/main/java/finaltc/reglas.g4 by ANTLR 4.13.1

package finaltc;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link reglasParser}.
 */
public interface reglasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link reglasParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(reglasParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(reglasParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(reglasParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(reglasParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(reglasParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(reglasParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(reglasParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(reglasParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(reglasParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(reglasParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#tipo_de_datos}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_datos(reglasParser.Tipo_de_datosContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#tipo_de_datos}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_datos(reglasParser.Tipo_de_datosContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#asignar}.
	 * @param ctx the parse tree
	 */
	void enterAsignar(reglasParser.AsignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#asignar}.
	 * @param ctx the parse tree
	 */
	void exitAsignar(reglasParser.AsignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(reglasParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(reglasParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(reglasParser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(reglasParser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(reglasParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(reglasParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(reglasParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(reglasParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(reglasParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(reglasParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(reglasParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(reglasParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(reglasParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(reglasParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#logico_comp}.
	 * @param ctx the parse tree
	 */
	void enterLogico_comp(reglasParser.Logico_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#logico_comp}.
	 * @param ctx the parse tree
	 */
	void exitLogico_comp(reglasParser.Logico_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(reglasParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(reglasParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(reglasParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(reglasParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#pos_pre_incremento}.
	 * @param ctx the parse tree
	 */
	void enterPos_pre_incremento(reglasParser.Pos_pre_incrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#pos_pre_incremento}.
	 * @param ctx the parse tree
	 */
	void exitPos_pre_incremento(reglasParser.Pos_pre_incrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#bloque_for}.
	 * @param ctx the parse tree
	 */
	void enterBloque_for(reglasParser.Bloque_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#bloque_for}.
	 * @param ctx the parse tree
	 */
	void exitBloque_for(reglasParser.Bloque_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(reglasParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(reglasParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#iif}.
	 * @param ctx the parse tree
	 */
	void enterIif(reglasParser.IifContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#iif}.
	 * @param ctx the parse tree
	 */
	void exitIif(reglasParser.IifContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(reglasParser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(reglasParser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void enterParametros_funcion(reglasParser.Parametros_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void exitParametros_funcion(reglasParser.Parametros_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_funcion(reglasParser.Tipo_de_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_funcion(reglasParser.Tipo_de_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(reglasParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(reglasParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion(reglasParser.Definicion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion(reglasParser.Definicion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#argumentos_funcion}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_funcion(reglasParser.Argumentos_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#argumentos_funcion}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_funcion(reglasParser.Argumentos_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(reglasParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(reglasParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasParser#finalizar_con_return}.
	 * @param ctx the parse tree
	 */
	void enterFinalizar_con_return(reglasParser.Finalizar_con_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasParser#finalizar_con_return}.
	 * @param ctx the parse tree
	 */
	void exitFinalizar_con_return(reglasParser.Finalizar_con_returnContext ctx);
}