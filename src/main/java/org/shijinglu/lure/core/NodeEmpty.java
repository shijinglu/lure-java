package org.shijinglu.lure.core;

import java.util.Map;
import org.shijinglu.lure.extensions.IData;

public class NodeEmpty extends Node {
    NodeEmpty() {
        super(EpType.EpIrreducibleLiteral, null, null, null, null, null);
    }

    @Override
    public IData evaluate(Map<String, IData> context) {
        return BoolData.FALSE;
    }
}
