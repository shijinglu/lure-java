package org.shijinglu.lure.core;

import org.shijinglu.lure.LureException;
import org.shijinglu.lure.extensions.IData;

public class BoolData implements IData {

    public static final BoolData TRUE = new BoolData(true);
    public static final BoolData FLASE = new BoolData(false);
    private final boolean value;

    public BoolData(boolean v) {
        this.value = v;
    }

    public static BoolData fromString(String raw) throws LureException {
        return new BoolData(Boolean.valueOf(raw));
    }

    @Override
    public String extKey() {
        return null;
    }

    @Override
    public int compareTo(IData rhs) {
        return Boolean.compare(value, rhs.toBool());
    }

    @Override
    public boolean toBool() {
        return value;
    }

    @Override
    public int toInt() {
        return value ? 1 : 0;
    }

    @Override
    public double toDouble() {
        return value ? 1.0 : 0.0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoolData boolData = (BoolData) o;

        return value == boolData.value;
    }

    @Override
    public int hashCode() {
        return (value ? 1 : 0);
    }
}
