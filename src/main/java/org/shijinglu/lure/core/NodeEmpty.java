package org.shijinglu.lure.core;

import org.shijinglu.lure.extensions.IData;

import java.util.Map;

public class NodeEmpty extends Node {
    NodeEmpty() {
        super(EpType.EpIrreducibleLiteral, null, null, null, null, null);
    }

    @Override
    public IData evaluate(Map<String, IData> context) {
        return BoolData.FALSE;
    }
}
