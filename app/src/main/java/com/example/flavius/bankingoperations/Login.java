package com.example.flavius.bankingoperations;

import java.util.ArrayList;


/**
 * Created by Flavius on 16-Nov-17.
 */

public class Login {

    public static Person currentUser;

    public static boolean validate (String username, String password){

        ArrayList<Person> personList = DatabaseProvider.listOfPersons;

        for(int i = 0;i<personList.size();i++){

            Person personFromList = personList.get(i);

            if(username.equals(personFromList.userName) && password.equals(personFromList.userPassword)){

                currentUser = personFromList;
                return true;

            }

        }
        return false;
    }

}
