package org.shijinglu.lure.core;

import java.util.Map;
import org.shijinglu.lure.extensions.IData;

/** Abstract syntax tree node, roughly equal to expr in the grammar */
public abstract class Node {
    final EpType epType;
    final Node left;
    final Node right;
    final String key;
    final IData data;
    NodeList list;

    Node(EpType epType, Node left, Node right, NodeList list, String key, IData data) {
        this.epType = epType;
        this.left = left;
        this.right = right;
        this.list = list;
        this.key = key;
        this.data = data;
    }

    /** Node is resolvable if its value may be derived from context map or function eval. */
    boolean isResolvable() {
        return epType == EpType.EpFunction || epType == EpType.EpIdentity;
    }

    /**
     * Evaluate data given context, return Literal False if current node does not match the context.
     */
    public abstract IData evaluate(Map<String, IData> context);

    // TODO: remove EpType, this is usefull in c. In java we use overrides
    enum EpType {
        EpUnknown,
        EpFunction,
        EpBinOp,
        EpIdentity,
        EpIrreducibleLiteral, // Like int, double or quoted string
    }
}
