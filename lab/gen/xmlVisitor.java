// Generated from D:/Projects/ANTLR-compiler/src/main/antlr4\xml.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xmlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link xmlParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(xmlParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#initialise_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialise_var(xmlParser.Initialise_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(xmlParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#add_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_assignment(xmlParser.Add_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#get_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_elem(xmlParser.Get_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#get_array_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_array_elem(xmlParser.Get_array_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(xmlParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(xmlParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#initialise_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialise_func(xmlParser.Initialise_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(xmlParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#else_if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_block(xmlParser.Else_if_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(xmlParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(xmlParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(xmlParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#range_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_statement(xmlParser.Range_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(xmlParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(xmlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#type_cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_cast(xmlParser.Type_castContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(xmlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#get_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_operation(xmlParser.Get_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml(xmlParser.XmlContext ctx);
}