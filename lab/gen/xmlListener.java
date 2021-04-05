// Generated from D:/Projects/ANTLR-compiler/src/main/antlr4\xml.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xmlParser}.
 */
public interface xmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xmlParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(xmlParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(xmlParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#initialise_var}.
	 * @param ctx the parse tree
	 */
	void enterInitialise_var(xmlParser.Initialise_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#initialise_var}.
	 * @param ctx the parse tree
	 */
	void exitInitialise_var(xmlParser.Initialise_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(xmlParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(xmlParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#add_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAdd_assignment(xmlParser.Add_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#add_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAdd_assignment(xmlParser.Add_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#get_elem}.
	 * @param ctx the parse tree
	 */
	void enterGet_elem(xmlParser.Get_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#get_elem}.
	 * @param ctx the parse tree
	 */
	void exitGet_elem(xmlParser.Get_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#get_array_elem}.
	 * @param ctx the parse tree
	 */
	void enterGet_array_elem(xmlParser.Get_array_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#get_array_elem}.
	 * @param ctx the parse tree
	 */
	void exitGet_array_elem(xmlParser.Get_array_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(xmlParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(xmlParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(xmlParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(xmlParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#initialise_func}.
	 * @param ctx the parse tree
	 */
	void enterInitialise_func(xmlParser.Initialise_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#initialise_func}.
	 * @param ctx the parse tree
	 */
	void exitInitialise_func(xmlParser.Initialise_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(xmlParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(xmlParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#else_if_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_block(xmlParser.Else_if_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#else_if_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_block(xmlParser.Else_if_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(xmlParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(xmlParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(xmlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(xmlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(xmlParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(xmlParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#range_statement}.
	 * @param ctx the parse tree
	 */
	void enterRange_statement(xmlParser.Range_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#range_statement}.
	 * @param ctx the parse tree
	 */
	void exitRange_statement(xmlParser.Range_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(xmlParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(xmlParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(xmlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(xmlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#type_cast}.
	 * @param ctx the parse tree
	 */
	void enterType_cast(xmlParser.Type_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#type_cast}.
	 * @param ctx the parse tree
	 */
	void exitType_cast(xmlParser.Type_castContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(xmlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(xmlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#get_operation}.
	 * @param ctx the parse tree
	 */
	void enterGet_operation(xmlParser.Get_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#get_operation}.
	 * @param ctx the parse tree
	 */
	void exitGet_operation(xmlParser.Get_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#xml}.
	 * @param ctx the parse tree
	 */
	void enterXml(xmlParser.XmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#xml}.
	 * @param ctx the parse tree
	 */
	void exitXml(xmlParser.XmlContext ctx);
}