package org.shijinglu.lure.core;

import org.shijinglu.lure.extensions.IData;

public class StringData implements IData {
    private final String value;

    public StringData(String value) {
        this.value = value;
    }

    @Override
    public String extKey() {
        return null;
    }

    @Override
    public int compareTo(IData rhs) {
        return value.compareTo(rhs.toString());
    }

    @Override
    public boolean toBool() {
        return Boolean.valueOf(value);
    }

    @Override
    public int toInt() throws NumberFormatException {
        return Integer.valueOf(value);
    }

    @Override
    public double toDouble() throws NumberFormatException{
        return Double.valueOf(value);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringData that = (StringData) o;

        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
