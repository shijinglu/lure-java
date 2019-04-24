package org.shijinglu.lure.extensions;

public interface IDataFactory {

    /** Identifier of the this factory. */
    String extKey();

    /**
     * Create a customized IData object
     *
     * @param valRaw string representation of the data, e.g. "v3.2.1"
     * @return an IData object
     */
    IData create(String valRaw);
}
