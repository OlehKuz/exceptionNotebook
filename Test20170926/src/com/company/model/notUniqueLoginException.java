package com.company.model;
public class notUniqueLoginException extends Exception{
    private String message;

    public notUniqueLoginException() {
        message = null;
    }

    public notUniqueLoginException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "notUniqueLoginException " + message;
    }
}
