package com.stanislav;

class InputException extends Exception {
    InputException() {
    }

    InputException(String message) {
        super(message);
    }

    InputException(String message, Throwable cause) {
        super(message, cause);
    }

    InputException(Throwable cause) {
        super(cause);
    }

    InputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
