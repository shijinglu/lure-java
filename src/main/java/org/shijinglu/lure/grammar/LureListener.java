// Generated from /Users/DaisyZhu/workspace/openab/lure.java/antlr4/Lure.g4 by ANTLR 4.7.1
package org.shijinglu.lure.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LureParser}.
 */
public interface LureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code exprListAppend}
	 * labeled alternative in {@link LureParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExprListAppend(LureParser.ExprListAppendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprListAppend}
	 * labeled alternative in {@link LureParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExprListAppend(LureParser.ExprListAppendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprListUnary}
	 * labeled alternative in {@link LureParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExprListUnary(LureParser.ExprListUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprListUnary}
	 * labeled alternative in {@link LureParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExprListUnary(LureParser.ExprListUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDoubleOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDoubleOp(LureParser.ExprDoubleOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDoubleOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDoubleOp(LureParser.ExprDoubleOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInOp(LureParser.ExprInOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInOp(LureParser.ExprInOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFunction}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunction(LureParser.ExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFunction}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunction(LureParser.ExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBetweenOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBetweenOp(LureParser.ExprBetweenOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBetweenOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBetweenOp(LureParser.ExprBetweenOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOrOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOrOp(LureParser.ExprOrOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOrOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOrOp(LureParser.ExprOrOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAndOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAndOp(LureParser.ExprAndOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAndOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAndOp(LureParser.ExprAndOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLiteralValue}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLiteralValue(LureParser.ExprLiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLiteralValue}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLiteralValue(LureParser.ExprLiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGroup}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprGroup(LureParser.ExprGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGroup}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprGroup(LureParser.ExprGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNotInOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNotInOp(LureParser.ExprNotInOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNotInOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNotInOp(LureParser.ExprNotInOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprUnaryOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryOp(LureParser.ExprUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnaryOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryOp(LureParser.ExprUnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLikeOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLikeOp(LureParser.ExprLikeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLikeOp}
	 * labeled alternative in {@link LureParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLikeOp(LureParser.ExprLikeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LureParser#cmp_op}.
	 * @param ctx the parse tree
	 */
	void enterCmp_op(LureParser.Cmp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LureParser#cmp_op}.
	 * @param ctx the parse tree
	 */
	void exitCmp_op(LureParser.Cmp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LureParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(LureParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LureParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(LureParser.Literal_valueContext ctx);
}