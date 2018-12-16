package org.shijinglu.lure.extensions;

public interface IDataFactory {
    /**
     * Create a customized IData object
     *
     * @param valRaw string representation of the data, e.g. "v3.2.1"
     * @param extKey string that signifies what type, e.g. "semver"
     * @return an IData object
     */
    IData create(String valRaw, String extKey);
}
