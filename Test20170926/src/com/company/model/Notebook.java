package com.company.model;

import java.util.Map;
import java.util.HashMap;

public class Notebook {

    private Map<String, String> users = new HashMap<String, String>();

    public Notebook(){

    }

    public boolean addNewUser(String name, String login) throws notUniqueLoginException {
        try {
            Database.addEntry(name, login);
            users.put(name, login);
            return true;
        } catch (notUniqueLoginException e) {
            throw e;
        }
    }
}