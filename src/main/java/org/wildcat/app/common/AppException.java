package org.wildcat.app.common;

public class AppException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String errorCode;
    private String errorMessage;
    private Exception exception;

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Exception getException() {
        return this.exception;
    }

    public AppException(String errorCode, String message, Exception exception) {
        this.errorCode = errorCode;
        this.errorMessage = message;
        this.exception = exception;
    }

}
