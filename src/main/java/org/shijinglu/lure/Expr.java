package org.shijinglu.lure;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.shijinglu.lure.core.AstBuilder;
import org.shijinglu.lure.core.BoolData;
import org.shijinglu.lure.core.DoubleData;
import org.shijinglu.lure.core.IntData;
import org.shijinglu.lure.core.Node;
import org.shijinglu.lure.core.StringData;
import org.shijinglu.lure.extensions.ExtensionManager;
import org.shijinglu.lure.extensions.IData;
import org.shijinglu.lure.grammar.LureLexer;
import org.shijinglu.lure.grammar.LureParser;

public class Expr {
    private final Node ast;

    public Expr(Node ast) {
        this.ast = ast;
    }

    /**
     * Build Expr AST from string.
     *
     * @param exprString a string literal that represents an rule, e.g. "CITY_ID == 1"
     * @return pre-compiled expression
     */
    public static Expr compile(String exprString) {
        CharStream s = CharStreams.fromString(exprString);
        LureLexer lexer = new LureLexer(s);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LureParser parser = new LureParser(tokenStream);
        ParseTreeWalker walker = ParseTreeWalker.DEFAULT;
        ParseTree astTree = parser.expr_list();
        AstBuilder listener = new AstBuilder();
        walker.walk(listener, astTree);
        return new Expr(listener.getAst());
    }

    /**
     * Evaluate pre-compiled expression object.
     *
     * @param context collection of contexts, such as CITY_ID: 5
     * @return true if expression is validate and eval-ed as true.
     */
    public boolean eval(Map<String, IData> context) {
        return ast.evaluate(context).toBool();
    }

    /**
     * Eval on the fly
     *
     * @param exprString a string literal that represents an rule, e.g. "CITY_ID == 1"
     * @param context collection of contexts, such as CITY_ID: 5
     * @return
     */
    public static boolean eval(String exprString, Map<String, IData> context) {
        return compile(exprString).eval(context);
    }

    public static class ContextBuilder {
        private final Map<String, IData> _context = new ConcurrentHashMap<>();

        public ContextBuilder addIntContext(String ctxKey, int ctxVal) {
            _context.put(ctxKey, new IntData(ctxVal));
            return this;
        }

        public ContextBuilder addBoolContext(String ctxKey, boolean ctxVal) {
            _context.put(ctxKey, new BoolData(ctxVal));
            return this;
        }

        public ContextBuilder addDoubleContext(String ctxKey, double ctxVal) {
            _context.put(ctxKey, new DoubleData(ctxVal));
            return this;
        }

        public ContextBuilder addStringContext(String ctxKey, String ctxVal) {
            _context.put(ctxKey, new StringData(ctxVal));
            return this;
        }

        public ContextBuilder addCustomizedContext(
                String ctxKey, String ctxValRaw, String typeName) {
            _context.put(
                    ctxKey,
                    ExtensionManager.EXT_DATA_TYPES.get(typeName).create(ctxValRaw, typeName));
            return this;
        }

        public Map<String, IData> build() {
            return _context;
        }
    }
}
