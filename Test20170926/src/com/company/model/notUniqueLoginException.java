package com.company.model;
public class notUniqueLoginException extends Exception{
    public notUniqueLoginException() {
        super();
    }

    public notUniqueLoginException(String message) {
        super(message) ;
    }

    @Override
    public String toString() {
        return "notUniqueLoginException ";
    }
}
