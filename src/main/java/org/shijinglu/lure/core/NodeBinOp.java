package org.shijinglu.lure.core;

import java.util.Map;
import org.shijinglu.lure.extensions.IData;

public class NodeBinOp extends Node {
    private final OpType op;

    NodeBinOp(OpType op, Node left, Node right, NodeList list, String key, IData data) {
        super(EpType.EpBinOp, left, right, list, key, data);
        this.op = op;
    }

    @Override
    public IData evaluate(Map<String, IData> context) {
        IData leftRet = left == null ? BoolData.FALSE : left.evaluate(context);
        IData rightRet = right == null ? BoolData.FALSE : right.evaluate(context);

        if (op == OpType.OR) {
            return (leftRet.toBool() || rightRet.toBool()) ? BoolData.TRUE : BoolData.FALSE;
        } else if (op == OpType.AND) {
            return (leftRet.toBool() && rightRet.toBool()) ? BoolData.TRUE : BoolData.FALSE;
        }
        int cmp = leftRet.compareTo(rightRet);
        boolean flag = false;
        switch (op) {
            case EQ:
                flag = cmp == 0;
                break;
            case GE:
                flag = cmp >= 0;
                break;
            case LE:
                flag = cmp <= 0;
                break;
            case GT:
                flag = cmp > 0;
                break;
            case LT:
                flag = cmp < 0;
                break;
            case NE:
                flag = cmp != 0;
                break;
        }
        return flag ? BoolData.TRUE : BoolData.FALSE;
    }

    enum OpType {
        EQ,
        NE,
        GT,
        LT,
        GE,
        LE,
        AND,
        OR
    }
}
