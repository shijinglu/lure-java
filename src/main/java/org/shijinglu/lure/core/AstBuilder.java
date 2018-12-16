package org.shijinglu.lure.core;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.shijinglu.lure.LureException;
import org.shijinglu.lure.grammar.LureBaseListener;
import org.shijinglu.lure.grammar.LureParser;

import java.util.IdentityHashMap;
import java.util.Map;

import static org.shijinglu.lure.LureException.ExceptionType.ParseError;
import static org.shijinglu.lure.core.NodeBinOp.OpType.AND;
import static org.shijinglu.lure.core.NodeBinOp.OpType.EQ;
import static org.shijinglu.lure.core.NodeBinOp.OpType.GE;
import static org.shijinglu.lure.core.NodeBinOp.OpType.GT;
import static org.shijinglu.lure.core.NodeBinOp.OpType.LE;
import static org.shijinglu.lure.core.NodeBinOp.OpType.LT;
import static org.shijinglu.lure.core.NodeBinOp.OpType.NE;
import static org.shijinglu.lure.core.NodeBinOp.OpType.OR;

public class AstBuilder extends LureBaseListener {
    private final Map<ParseTree, Node> astMap = new IdentityHashMap<>();
    private Node root;

    public Node getAst() {
        return root;
    }

    /**
     * `expr_list: expr_list ',' expr`
     */
    @Override
    public void exitExprListAppend(LureParser.ExprListAppendContext ctx) {
        super.exitExprListAppend(ctx);
        Node n = astMap.get(ctx.expr_list());
        if (n.list == null) {
            n.list = new NodeList();
            n.list.add(n);
        }
        n.list.add(astMap.get(ctx.expr()));
        astMap.put(ctx, n);
    }

    /**
     * `expr_list: expr`
     */
    @Override
    public void exitExprListUnary(LureParser.ExprListUnaryContext ctx) {
        super.exitExprListUnary(ctx);
        root = astMap.get(ctx.expr());
        astMap.put(ctx, root);
    }

    @Override
    public void exitExprDoubleOp(LureParser.ExprDoubleOpContext ctx) {
        super.exitExprDoubleOp(ctx);
        astMap.put(ctx, fromBinOp(
                ctx.cmp_op().getChild(0),
                astMap.get(ctx.expr(0)),
                astMap.get(ctx.expr(1))));
    }

    @Override
    public void exitExprInOp(LureParser.ExprInOpContext ctx) {
        super.exitExprInOp(ctx);
        // ctx.expr_list()
        astMap.put(ctx, new NodeIn(
                astMap.get(ctx.expr()),
                null,
                astMap.get(ctx.expr_list()).list,
                null,
                null
        ));
    }

    @Override
    public void exitExprFunction(LureParser.ExprFunctionContext ctx) {
        super.exitExprFunction(ctx);
        astMap.put(ctx,
                new NodeFunction(
                        NodeIdentity.fromString(ctx.getChild(0).getText()),
                        null,
                        astMap.get(ctx.expr_list()).list,
                        null,
                        null)
        );
    }

    @Override
    public void exitExprBetweenOp(LureParser.ExprBetweenOpContext ctx) {
        super.exitExprBetweenOp(ctx);
        Node n1 = new NodeBinOp(GE, astMap.get(ctx.expr(0)), astMap.get(ctx.expr(1)), null, null, null);
        Node n2 = new NodeBinOp(LE, astMap.get(ctx.expr(0)), astMap.get(ctx.expr(2)), null, null, null);
        astMap.put(ctx, new NodeBinOp(AND, n1, n2, null, null, null));
    }

    @Override
    public void exitExprOrOp(LureParser.ExprOrOpContext ctx) {
        super.exitExprOrOp(ctx);
        astMap.put(ctx, new NodeBinOp(
                OR,
                astMap.get(ctx.expr(0)),
                astMap.get(ctx.expr(1)),
                null,
                null,
                null));
    }

    @Override
    public void exitExprAndOp(LureParser.ExprAndOpContext ctx) {
        super.exitExprAndOp(ctx);
        astMap.put(ctx, new NodeBinOp(
                AND,
                astMap.get(ctx.expr(0)),
                astMap.get(ctx.expr(1)),
                null,
                null,
                null));
    }

    @Override
    public void exitExprLiteralValue(LureParser.ExprLiteralValueContext ctx) {
        super.exitExprLiteralValue(ctx);
        Node n = astMap.get(ctx.literal_value());
        if (n == null) {
            throw LureException.of(ParseError,
                    "fail to parse 'expr: literal_value' rule, literal value cannot be null");
        }
        astMap.put(ctx, n);
    }

    @Override
    public void exitExprGroup(LureParser.ExprGroupContext ctx) {
        super.exitExprGroup(ctx);
        astMap.put(ctx, astMap.get(ctx.expr()));
    }

    @Override
    public void exitExprNotInOp(LureParser.ExprNotInOpContext ctx) {
        super.exitExprNotInOp(ctx);
        Node in = new NodeIn(
                astMap.get(ctx.expr()),
                null,
                astMap.get(ctx.expr_list()).list,
                null,
                null
        );
        astMap.put(ctx, new NodeBinOp(EQ, in, NodeLiteral.fromBoolean(false), null, null, null));
    }

    @Override
    public void exitExprUnaryOp(LureParser.ExprUnaryOpContext ctx) {
        super.exitExprUnaryOp(ctx);
        astMap.put(ctx, new NodeBinOp(
                EQ,
                astMap.get(ctx.expr()),
                NodeLiteral.fromBoolean(false),
                null,
                null,
                null));
    }

    @Override
    public void exitExprLikeOp(LureParser.ExprLikeOpContext ctx) {
        super.exitExprLikeOp(ctx);
        astMap.put(ctx, new NodeLike(
                NodeIdentity.fromString(ctx.expr().getText()),
                NodeIdentity.fromString(ctx.getChild(2).getText()),
                null,
                null,
                null));
    }

    private Node fromBinOp(ParseTree token, Node left, Node right) {
        assert token != null;
        assert left != null;
        assert right != null;
        assert token instanceof TerminalNodeImpl;
        switch (((TerminalNodeImpl) token).symbol.getType()) {
            case LureParser.TK_EQ:
                return new NodeBinOp(EQ, left, right, null, null, null);
            case LureParser.TK_NE:
                return new NodeBinOp(NE, left, right, null, null, null);
            case LureParser.TK_GT:
                return new NodeBinOp(GT, left, right, null, null, null);
            case LureParser.TK_LT:
                return new NodeBinOp(LT, left, right, null, null, null);
            case LureParser.TK_GE:
                return new NodeBinOp(GE, left, right, null, null, null);
            case LureParser.TK_LE:
                return new NodeBinOp(LE, left, right, null, null, null);
            default:
                throw LureException.of(ParseError, "unexpected comparator");
        }
    }

    @Override
    public void enterCmp_op(LureParser.Cmp_opContext ctx) {
        super.enterCmp_op(ctx);

    }

    @Override
    public void exitCmp_op(LureParser.Cmp_opContext ctx) {
        super.exitCmp_op(ctx);
        ParseTree child = ctx.getChild(0);
        if (child instanceof TerminalNodeImpl) {
            switch (((TerminalNodeImpl) child).symbol.getType()) {
                case LureParser.TK_EQ:
                    break;
            }
        }
    }

    @Override
    public void exitLiteral_value(LureParser.Literal_valueContext ctx) {
        super.exitLiteral_value(ctx);
        ParseTree child = ctx.getChild(0);
        if (child instanceof TerminalNodeImpl) {
            final String childText = child.getText();
            switch (((TerminalNodeImpl) child).symbol.getType()) {
                case LureParser.TK_IDENTIFIER:
                    // create identity node and add to map
                    this.astMap.put(ctx, NodeIdentity.fromString(childText));
                    break;
                case LureParser.TK_STRING_LITERAL:
                    String text = child.getText();
                    if (text.length() >= 2) {
                        text = text.substring(1, text.length() - 1);
                    }
                    this.astMap.put(ctx, NodeLiteral.fromString(text));
                    break;
                case LureParser.TK_DOUBLE_LITERAL:
                    double val = Double.valueOf(childText);
                    this.astMap.put(ctx, NodeLiteral.fromDouble(val));
                    break;
                case LureParser.TK_BOOLEAN_LITERAL:
                    this.astMap.put(ctx, NodeLiteral.fromBoolean(Boolean.valueOf(childText)));
                    break;
                case LureParser.TK_INT_LITERAL:
                    this.astMap.put(ctx, NodeLiteral.fromInt(Integer.valueOf(childText)));
                    break;
                default:
                    throw LureException.of(ParseError, "un-expected literal_value: " + childText);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        throw LureException.of(LureException.ExceptionType.ParseError, node.toString());
        // super.visitErrorNode(node);
    }
}
