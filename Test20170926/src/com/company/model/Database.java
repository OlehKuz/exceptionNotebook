package com.company.model;

public enum Database extends Throwable{
    USER_1 ("VAsil", "chap123")
    USER_2 ("boBik", "terminator9")
    USER_3 ("Vetal", "Kyku")
    USER_4 ("Belka", "Strelka112")

    private String firstName;
    private String login;

    public Database(){
    }

    public addEntry(String firstName, String login){
            for(Database l : Database.values()){
                if(l.login.equals(login)){
                    super(login);
                }
            }
            this.firstName = firstName;
            this.login = login;
    }


}