package org.shijinglu.lure;

public class LureException extends RuntimeException {
    public enum ExceptionType {
        ParseError,
        CastError,
    }

    private final ExceptionType type;

    private LureException(ExceptionType type, String message, Throwable err) {
        super(message, err);
        this.type = type;
    }


    public static LureException of(ExceptionType type, String message) {
        return new LureException(type, message, null);
    }

    public static LureException of(ExceptionType type, Throwable err) {
        return new LureException(type, null, err);
    }
}
