package ru.svetashov.exception;

public class FractionException extends RuntimeException{
    public FractionException(String message){
        super(message);
    }
    public FractionException(String message, Throwable runtimeException){
        super(message, runtimeException);
    }
}