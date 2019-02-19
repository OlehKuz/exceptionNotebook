package com.company.model;
import com.company.model.notUniqueLoginException;

public enum Database {
    USER_1 ("VAsil", "chap123"),
    USER_2 ("boBik", "terminator9"),
    USER_3 ("Vetal", "Kyku"),
    USER_4 ("Belka", "Strelka112");

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
                throw new notUniqueLoginException(login);
            }
        }
    }





}