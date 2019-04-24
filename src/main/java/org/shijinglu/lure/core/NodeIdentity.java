package org.shijinglu.lure.core;

import java.util.Map;
import org.shijinglu.lure.extensions.IData;

/** Identity node can be variable(reducible) or unquoted string(irreducible) */
public class NodeIdentity extends Node {

    /**
     * CITY_ID == 1 => NodeIdnetiy("some description", "CITY_ID")
     *
     * @param key saved for future use
     * @param data the text of the identity
     */
    NodeIdentity(String key, IData data) {
        super(EpType.EpIdentity, null, null, null, key, data);
    }

    static NodeIdentity fromString(String val) {
        return new NodeIdentity(val, new StringData(val));
    }

    @Override
    public IData evaluate(Map<String, IData> context) {
        if (data == null) {
            return BoolData.FALSE;
        }
        String key = data.toString();
        return context.getOrDefault(key, new StringData(key));
    }
}
