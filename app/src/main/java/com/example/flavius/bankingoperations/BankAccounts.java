package com.example.flavius.bankingoperations;

import java.util.ArrayList;

/**
 * Created by Flavius on 18-Nov-17.
 */

public class BankAccounts {

    public int bankAccountID;
    public double bankAccountBalance;
    int bankAccountOwnerID;

    public ArrayList<Integer> personID;

    BankAccounts(int bankAccountID, double bankAccountBalance, int bankAccountOwnerID, ArrayList<Integer> personsID){

        this.bankAccountID = bankAccountID;
        this.bankAccountBalance = bankAccountBalance;
        this.bankAccountOwnerID = bankAccountOwnerID;
        this.personID = personsID;

    }

}
