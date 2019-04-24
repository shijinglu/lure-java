package org.shijinglu.lure.extensions;

/**
 * Implement this interface to let Lure support customized data type. e.g "ver in (v3.2.0, v3.2.1,
 * v3.2.2)", we can set ver as the customized data type in the context: ver -> {value: "v3.2.2",
 * type: "semver"}
 */
public interface IData {

    /**
     * Cast string to Data
     *
     * @param raw string representation of a structured data, i.e. `v3.2.1`
     * @return casted data
     * @throws IllegalArgumentException cast error
     */
    static IData fromString(String raw) throws IllegalArgumentException {
        return null;
    }

    /**
     * Return non-null value if this is a customized data type. This key will be used to search
     * corresponding IData implementations in the extension library.
     *
     * @return key of the extension, e.g "semver" for semantic version type.
     */
    String extKey();

    int compareTo(IData rhs);

    boolean toBool();

    int toInt();

    double toDouble();
}
