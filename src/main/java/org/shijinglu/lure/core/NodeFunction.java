package org.shijinglu.lure.core;

import org.shijinglu.lure.extensions.ExtensionManager;
import org.shijinglu.lure.extensions.IData;
import org.shijinglu.lure.extensions.IFunction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NodeFunction extends Node {
    NodeFunction(Node left, Node right, NodeList list, String key, IData data) {
        super(EpType.EpFunction, left, right, list, key, data);
    }

    /**
     * Use left node string to search (case sensitive) for the functional in the extensions.
     * If hit miss, return false, else use the functional to eval.
     */
    @Override
    public IData evaluate(final Map<String, IData> context) {
        if (left == null || list == null) {
            return BoolData.FALSE;
        }
        final boolean shouldResolveList = list.isResolvable();
        List<IData> params = list.getList()
                .stream()
                .map(n -> {
                    if (shouldResolveList) {
                        return n.evaluate(context);
                    }
                    return n.data;
                })
                .collect(Collectors.toList());
        // left node string serves as the function name
        final String fname = left.data.toString();
        IFunction function = ExtensionManager.FUNCTIONS.get(fname);
        if (function == null) {
            return BoolData.FALSE;
        }
        return function.derive(params);
    }
}
