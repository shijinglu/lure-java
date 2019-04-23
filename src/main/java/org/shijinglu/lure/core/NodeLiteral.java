package org.shijinglu.lure.core;

import org.shijinglu.lure.extensions.IData;

import java.util.Map;

public class NodeLiteral extends Node {
    NodeLiteral(EpType epType, Node left, Node right, NodeList list, String key, IData data) {
        super(epType, left, right, list, key, data);
    }

    static NodeLiteral fromBoolean(boolean val) {
        return new NodeLiteral(EpType.EpIrreducibleLiteral, null, null, null, null, new BoolData(val));
    }

    static NodeLiteral fromString(String val) {
        return new NodeLiteral(EpType.EpIrreducibleLiteral, null, null, null, null, new StringData(val));
    }

    static NodeLiteral fromDouble(double val) {
        return new NodeLiteral(EpType.EpIrreducibleLiteral, null, null, null, null, new DoubleData(val));
    }

    static NodeLiteral fromInt(int val) {
        return new NodeLiteral(EpType.EpIrreducibleLiteral, null, null, null, null, new IntData(val));
    }

    @Override
    public IData evaluate(Map<String, IData> context) {
        return data == null ? BoolData.FALSE : data;
    }
}
