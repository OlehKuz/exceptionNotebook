package com.company.model;
import com.company.model.notUniqueLoginException;

public enum Database {
    USER_1 ("Василь", "Chap1234"),
    USER_2 ("Бобік", "Terminator9"),
    USER_3 ("Іванушка", "Kykushka2"),
    USER_4 ("Білка", "Strelka112");

    private String firstName;
    private String login;

    Database(String firstName, String login){
        this.firstName = firstName;
        this.login = login;

    }
    private String getName(){
         return firstName;
    }

    private String getLogin(){
         return login;
    }
    public static void addEntry(String firstName, String login) throws notUniqueLoginException {
        for(Database users : Database.values()){
            if(users.getLogin().equals(login)){
                throw new notUniqueLoginException("Sorry, login " + login + " is already used by smn else ");
            }
        }
    }





}