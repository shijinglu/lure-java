package org.shijinglu.lure.core;

import org.shijinglu.lure.extensions.IData;

import java.util.Map;

public class NodeLike extends Node {
    NodeLike(Node left, Node right, NodeList list, String key, IData data) {
        super(EpType.EpBinOp, left, right, list, key, data);
    }

    /**
     * This eval treats the right node's string value as a regex and return true of the
     * left side matches the right patten.
     */
    @Override
    public IData evaluate(Map<String, IData> context) {

        if (left == null || right == null) {
            return BoolData.FLASE;
        }
        IData leftRes = left.evaluate(context);
        IData rightRes = right.evaluate(context);
        if (leftRes.toString().matches(rightRes.toString())) {
            return BoolData.TRUE;
        }
        return BoolData.FLASE;
    }
}
