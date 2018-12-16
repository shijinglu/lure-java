package org.shijinglu.lure.extensions;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ExtensionManager {
    public static final ConcurrentMap<String, IFunction> FUNCTIONS;
    public static final ConcurrentMap<String, IDataFactory> EXT_DATA_TYPES;


    static {
        FUNCTIONS = new ConcurrentHashMap<>();
        // TODO: add more extension functions here
        FUNCTIONS.put("md5mod", new FunctionMd5Mod());
        // TODO: support more data types here
        EXT_DATA_TYPES = new ConcurrentHashMap<>();
        EXT_DATA_TYPES.put("semver", new VersionData.VersionDataBuilder());
    }
}
