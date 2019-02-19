package com.company.model;
import com.company.model.notUniqueLoginException;

public enum Database{
    USER_1 ("VAsil", "chap123"),
    USER_2 ("boBik", "terminator9"),
    USER_3 ("Vetal", "Kyku"),
    USER_4 ("Belka", "Strelka112")

    private String firstName;
    private String login;


    public Database(){
    }


    boolean addEntry(String firstName, String login) throws notUniqueLoginException {
            for(Database l : Database.values()){
                if(l.login.equals(login)){
                    throw new notUniqueLoginException(login);
                }
            }
            this.firstName = firstName;
            this.login = login;
    }


}