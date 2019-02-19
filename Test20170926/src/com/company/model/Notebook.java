package com.company.model;

import java.util.Map;
import java.util.HashMap;

public class Notebook {

    private Map<String, String> users = new HashMap<String, String>();

    public Notebook(){

    }

    public void addNewUser(String name, String login) throws notUniqueLoginException {
        try {
            Database.addEntry(name, login);
            users.put(name, login);
        } catch (notUniqueLoginException e) {
            System.out.println("exception caught");
            System.out.println("First exception hadle starck trace");
            throw e;
        }
    }
}