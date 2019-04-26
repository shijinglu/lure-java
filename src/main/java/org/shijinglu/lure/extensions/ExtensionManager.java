package org.shijinglu.lure.extensions;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ExtensionManager {
    private static final ConcurrentMap<String, IFunction> FUNCTIONS;
    private static final ConcurrentMap<String, IDataFactory> EXT_DATA_TYPES;

    static {
        FUNCTIONS = new ConcurrentHashMap<>();
        EXT_DATA_TYPES = new ConcurrentHashMap<>();
        addFunction(new FunctionMd5Mod());
        addDataFactory(new VersionData.VersionDataBuilder());
    }

    public static IFunction getFunction(String fname) {
        return FUNCTIONS.get(fname);
    }

    public static void addFunction(IFunction f) {
        String fname = f.functionName();
        if (FUNCTIONS.containsKey(fname)) {
            throw new IllegalArgumentException(
                    String.format(
                            "Function name '%s' has already been registered, consider using a different name",
                            fname));
        }
        FUNCTIONS.put(fname, f);
    }

    public static IDataFactory getDataFactor(String dfName) {
        return EXT_DATA_TYPES.get(dfName);
    }

    public static void addDataFactory(IDataFactory df) {
        String extKey = df.extKey();
        if (EXT_DATA_TYPES.containsKey(extKey)) {
            throw new IllegalArgumentException(
                    String.format(
                            "Data type name '%s' has already been in use, consider using a different name",
                            extKey));
        }
        EXT_DATA_TYPES.put(extKey, df);
    }
}
