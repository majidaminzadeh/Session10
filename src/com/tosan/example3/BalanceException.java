package com.tosan.example3;

public class BalanceException extends Exception{
    public BalanceException(String message){
        super(message);
    }

    public BalanceException(String message, Throwable cause){
        super(message, cause);
    }
}
