package edu.epam.carshop.exception;

public class PropertiesLoaderException extends Exception{

    public PropertiesLoaderException() {}

    public PropertiesLoaderException(String message) {
        super(message);
    }

    public PropertiesLoaderException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public PropertiesLoaderException(Throwable throwable) {
        super(throwable);
    }
}
