package com.company.model;

public enum Database{
    USER_1 ("VAsil", "chap123")
    USER_2 ("boBik", "terminator9")
    USER_3 ("Vetal", "Kyku")
    USER_4 ("Belka", "Strelka112")

    private String firstName;
    private String login;

    publci Database(String firstName, String login){
        this.firstName = firstName;
        this.login = login;
    }


}