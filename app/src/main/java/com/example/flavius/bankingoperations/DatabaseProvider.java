package com.example.flavius.bankingoperations;

import com.example.flavius.bankingoperations.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Flavius on 17-Nov-17.
 */

public class DatabaseProvider {

    public static ArrayList<Person> listOfPersons;
    public static ArrayList<BankAccounts> listOfBankAccounts;


    public static void initDataBase() {

        listOfPersons = new ArrayList<>();

        ArrayList<Integer> managerAccountIDs = new ArrayList<>(Arrays.asList(10,11,12,13,14,15,16,17,18));
        ArrayList<Integer> person1AccountIDs = new ArrayList<>(Arrays.asList(10,11));
        ArrayList<Integer> person2AccountIDs = new ArrayList<>(Arrays.asList(12));
        ArrayList<Integer> person3AccountIDs = new ArrayList<>(Arrays.asList(13,14,15));
        ArrayList<Integer> person4AccountIDs = new ArrayList<>(Arrays.asList(16));
        ArrayList<Integer> person5AccountIDs = new ArrayList<>(Arrays.asList(17,18));


        listOfPersons.add(new Person("Bank Manager", "admin", "0000", 0,managerAccountIDs));
        listOfPersons.add(new Person("Person 1", "person1", "1111", 1,person1AccountIDs));
        listOfPersons.add(new Person("Person 2", "person2", "2222", 2,person2AccountIDs));
        listOfPersons.add(new Person("Person 3", "person3", "3333", 3,person3AccountIDs));
        listOfPersons.add(new Person("Person 4", "person4", "4444", 4,person4AccountIDs));
        listOfPersons.add(new Person("Person 5", "person5", "5555", 5,person5AccountIDs));

        listOfBankAccounts = new ArrayList<>();

        ArrayList<Integer> bankAccount1PersonAccessID = new ArrayList<>(Arrays.asList(0,1));
        ArrayList<Integer> bankAccount2PersonAccessID = new ArrayList<>(Arrays.asList(0,1));
        ArrayList<Integer> bankAccount3PersonAccessID = new ArrayList<>(Arrays.asList(0,2));
        ArrayList<Integer> bankAccount4PersonAccessID = new ArrayList<>(Arrays.asList(0,3));
        ArrayList<Integer> bankAccount5PersonAccessID = new ArrayList<>(Arrays.asList(0,3));
        ArrayList<Integer> bankAccount6PersonAccessID = new ArrayList<>(Arrays.asList(0,3));
        ArrayList<Integer> bankAccount7PersonAccessID = new ArrayList<>(Arrays.asList(0,4));
        ArrayList<Integer> bankAccount8PersonAccessID = new ArrayList<>(Arrays.asList(0,5));
        ArrayList<Integer> bankAccount9PersonAccessID = new ArrayList<>(Arrays.asList(0,5));


        listOfBankAccounts.add(new BankAccounts(10,251.70,1,bankAccount1PersonAccessID));
        listOfBankAccounts.add(new BankAccounts(11,5000,1,bankAccount2PersonAccessID));
        listOfBankAccounts.add(new BankAccounts(12,1579.72,2,bankAccount3PersonAccessID));
        listOfBankAccounts.add(new BankAccounts(13,25148.02,3,bankAccount4PersonAccessID));
        listOfBankAccounts.add(new BankAccounts(14,3749,3,bankAccount5PersonAccessID));
        listOfBankAccounts.add(new BankAccounts(15,579,3,bankAccount6PersonAccessID));
        listOfBankAccounts.add(new BankAccounts(16,837555.92,4,bankAccount7PersonAccessID));
        listOfBankAccounts.add(new BankAccounts(17,20578,5,bankAccount8PersonAccessID));
        listOfBankAccounts.add(new BankAccounts(18,2519.25,5,bankAccount9PersonAccessID));

    }

}
