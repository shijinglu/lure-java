package org.shijinglu.lure.core;

import org.shijinglu.lure.extensions.IData;

import java.util.Map;

public class NodeIn extends Node {
    public NodeIn(Node left, Node right, NodeList list, String key, IData data) {
        super(EpType.EpBinOp, left, right, list, key, data);
    }

    /**
     * This eval will first resolve left side and then go through the list
     * and resolve all nodes recursively if right side is resolvable, if
     * not, it simple use call set.contains for quick look up.
     */
    @Override
    public IData evaluate(Map<String, IData> context) {
        if (left == null || list == null) {
            return BoolData.FALSE;
        }
        IData leftRes = left.evaluate(context);
        if (list.getSet().contains(leftRes)) {
            return BoolData.TRUE;
        }
        if (list.isResolvable()) {
            for (Node n : list.getList()) {
                if (leftRes.compareTo(n.evaluate(context)) == 0) {
                    return BoolData.TRUE;
                }
            }
        }
        return BoolData.FALSE;
    }
}
