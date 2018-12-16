package org.shijinglu.lure.core;

import org.shijinglu.lure.extensions.IData;

import java.util.Map;

public class NodeBinOp extends Node {
    private final OpType op;

    NodeBinOp(OpType op, Node left, Node right, NodeList list, String key, IData data) {
        super(EpType.EpBinOp, left, right, list, key, data);
        this.op = op;
    }

    @Override
    public IData evaluate(Map<String, IData> context) {
        IData leftRet = left == null ? BoolData.FLASE : left.evaluate(context);
        IData rightRet = right == null ? BoolData.FLASE : right.evaluate(context);

        if (op == OpType.OR) {
            return (leftRet.toBool() || rightRet.toBool()) ? BoolData.TRUE : BoolData.FLASE;
        } else if (op == OpType.AND) {
            return (leftRet.toBool() && rightRet.toBool()) ? BoolData.TRUE : BoolData.FLASE;
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
        return flag ? BoolData.TRUE : BoolData.FLASE;
    }

    enum OpType {
        EQ, NE, GT, LT, GE, LE, AND, OR
    }
}
