// Generated from c:/Users/Agux/Desktop/DefinitivoTC/finaltc/src/main/java/finaltc/reglas.g4 by ANTLR 4.13.1

package finaltc;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link reglasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface reglasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link reglasParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(reglasParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(reglasParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(reglasParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(reglasParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(reglasParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#tipo_de_datos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_de_datos(reglasParser.Tipo_de_datosContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignar(reglasParser.AsignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(reglasParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(reglasParser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(reglasParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(reglasParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(reglasParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(reglasParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(reglasParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(reglasParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#logico_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico_comp(reglasParser.Logico_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(reglasParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(reglasParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#pos_pre_incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPos_pre_incremento(reglasParser.Pos_pre_incrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(reglasParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(reglasParser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(reglasParser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#parametros_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_funcion(reglasParser.Parametros_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_de_funcion(reglasParser.Tipo_de_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#definicion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion(reglasParser.Definicion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#argumentos_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos_funcion(reglasParser.Argumentos_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(reglasParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglasParser#finalizar_con_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalizar_con_return(reglasParser.Finalizar_con_returnContext ctx);
}