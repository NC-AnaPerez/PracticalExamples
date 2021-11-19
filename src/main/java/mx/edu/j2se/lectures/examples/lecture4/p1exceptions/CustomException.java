package mx.edu.j2se.lectures.examples.lecture4.p1exceptions;

public class CustomException extends Error {

    private final int errorCorde;
    private final String details;

    CustomException(int errorCorde) {
        super(null, null, false, false);
        this.errorCorde = errorCorde;
        this.details = null;
    }

    CustomException(int errorCorde, String details) {
        super(null, null, false, false);
        this.errorCorde = errorCorde;
        this.details = details;
    }

    @Override
    public String getMessage() {
        return details == null ?
                String.format("{ErrorCode:%d}", errorCorde) :
                String.format("{ErrorCode:%d, ErrorDetail:\"%s\"}", errorCorde, details);
    }
}
