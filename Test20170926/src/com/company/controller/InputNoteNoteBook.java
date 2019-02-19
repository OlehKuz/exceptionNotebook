package com.company.controller;
import com.company.model.notUniqueLoginException;
import com.company.model.Notebook;
import com.company.view.View;

import java.util.Scanner;

import static com.company.controller.RegexContainer.*;
import static com.company.controller.RegexContainer.REGEX_LOGIN;
import static com.company.view.TextConstant.*;
import static com.company.view.TextConstant.LOGIN_DATA;

/**
 * Created by student on 26.09.2017.
 */
public class InputNoteNoteBook {
    private View view;
    private Scanner sc;
    private Notebook notebook;

    private String firstName;
    private String login;

    public InputNoteNoteBook(View view, Scanner sc, Notebook notebook) {
        this.view = view;
        this.sc = sc;
        this.notebook = notebook;
    }

    public void inputNote(Notebook note) {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, str);
        boolean addedSuccess = false;
        while (!addedSuccess) {
            try {
                this.login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
                addedSuccess = note.addNewUser(firstName, login);
                System.out.printf("You have successfully created an account with name %s and login %s ",
                        this.firstName, this.login );
            } catch (notUniqueLoginException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
                System.out.println("Your name is " + this.firstName);
                System.out.println("Login you tried last time " + this.login);
            }
        }
    }
}
