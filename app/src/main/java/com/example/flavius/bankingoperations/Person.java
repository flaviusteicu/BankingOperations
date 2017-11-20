package com.example.flavius.bankingoperations;

import java.util.ArrayList;

/**
 * Created by Flavius on 13-Nov-17.
 */

public class Person {

    String personName;
    String userName;
    String userPassword;
    public int personID;

   public ArrayList<Integer> bankAccountsIDs;


    public Person(String personName, String userName, String userPassword, int personID, ArrayList<Integer> accountIDs) {

        this.personName = personName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.personID = personID;
        this.bankAccountsIDs = accountIDs;

    }



}
