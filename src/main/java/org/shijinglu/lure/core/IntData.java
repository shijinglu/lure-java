package org.shijinglu.lure.core;

import org.shijinglu.lure.LureException;
import org.shijinglu.lure.extensions.IData;

public class IntData implements IData {
    private final int value;

    public IntData(int value) {
        this.value = value;
    }

    public static IData fromString(String raw) throws LureException {
        try {
            return new IntData(Integer.valueOf(raw));
        } catch (NumberFormatException e) {
            throw LureException.of(LureException.ExceptionType.CastError,
                    "Cannot cast '" + raw + "' to integer");
        }
    }

    @Override
    public String extKey() {
        return null;
    }

    @Override
    public int compareTo(IData rhs) {
        if (rhs instanceof DoubleData) {
            return Double.compare(toDouble(), rhs.toDouble());
        }
        return Integer.compare(value, rhs.toInt());
    }

    @Override
    public boolean toBool() {
        return value != 0;
    }

    @Override
    public int toInt() {
        return value;
    }

    @Override
    public double toDouble() {
        return (double) toInt();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntData intData = (IntData) o;

        return value == intData.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
