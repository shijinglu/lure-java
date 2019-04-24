package org.shijinglu.lure.extensions;

import java.util.List;
import org.shijinglu.lure.LureException;

public interface IFunction {
    /**
     * Unique name to identify which function to load
     *
     * @return function name
     */
    String functionName();

    /**
     * Derive a value from astNode and Data and write it back to astNode. For example: if
     * getExtKey() == "semver": astNode.derivedData.genericValue = [int(s) for s in
     * Data.strVal.split('.')]
     *
     * @param params parameters
     * @throws LureException failure during derivation
     */
    IData derive(List<IData> params) throws LureException;
}
