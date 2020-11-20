package edu.epam.carshop.exception;

public class ReaderServiceException extends Exception{

    public ReaderServiceException() {}

    public ReaderServiceException(String message) {
        super(message);
    }

    public ReaderServiceException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ReaderServiceException(Throwable throwable) {
        super(throwable);
    }
}



