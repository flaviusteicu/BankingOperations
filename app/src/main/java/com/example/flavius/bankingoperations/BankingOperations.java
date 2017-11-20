package com.example.flavius.bankingoperations;

import android.provider.ContactsContract;

/**
 * Created by Flavius on 18-Nov-17.
 */

public class BankingOperations {

    public double checkBalance(int accountID) {

        double balance = 0;

        for (int i = 0; i < DatabaseProvider.listOfBankAccounts.size(); i++) {
            BankAccounts accounts = DatabaseProvider.listOfBankAccounts.get(i);
            if (accountID == accounts.bankAccountID) {

                balance = accounts.bankAccountBalance;

                return balance;

            }

        }

        return balance;

    }


    public boolean depositMoney(int accountID, double sumToDeposit) {

        double balance = 0;

        for(int i = 0;i<DatabaseProvider.listOfBankAccounts.size();i++){

            BankAccounts accounts = DatabaseProvider.listOfBankAccounts.get(i);

            if (accountID == accounts.bankAccountID){

                accounts.bankAccountBalance += sumToDeposit;

                return true;

            }

        }

        return false;
    }

    public boolean withdrawMoney(int accountID, double sumToWithdraw) {

        double balance = 0;

        for(int i=0;i<DatabaseProvider.listOfBankAccounts.size();i++){

            BankAccounts accounts = DatabaseProvider.listOfBankAccounts.get(i);

            if(accountID == accounts.bankAccountID){

                accounts.bankAccountBalance -= sumToWithdraw;

                return true;

            }

        }

        return false;

    }

    public boolean transferMoney(int accountID, double sumToTransfer, int targetAccountForTransfer) {

        double balance = 0;

        for(int i=0;i<DatabaseProvider.listOfBankAccounts.size();i++){

            BankAccounts accounts = DatabaseProvider.listOfBankAccounts.get(i);

            if(accounts.bankAccountID == accountID){

                for(int j=0;j<DatabaseProvider.listOfBankAccounts.size();j++){

                    BankAccounts targetAccount = DatabaseProvider.listOfBankAccounts.get(j);

                    if(targetAccount.bankAccountID ==  targetAccountForTransfer){

                        accounts.bankAccountBalance -= sumToTransfer;
                        targetAccount.bankAccountBalance += sumToTransfer;

                        return true;

                    }

                }

            }

        }

        return false;

    }

    public boolean allowAccessToAccount(int ownnerID, int accountID, int personToReceiveAccessID) {

        for(int i = 0; i < DatabaseProvider.listOfBankAccounts.size();i++){

            BankAccounts ownerAccount = DatabaseProvider.listOfBankAccounts.get(i);

            if(ownerAccount.bankAccountOwnerID == ownnerID){

                for(int j = 1; j < DatabaseProvider.listOfPersons.size();j++){

                    Person personToReceiveAccess = DatabaseProvider.listOfPersons.get(i);

                    if(personToReceiveAccess.personID == personToReceiveAccessID){

                        DatabaseProvider.listOfPersons.get(5);

                    }


                }
            }

        }

        return true;

    }

}
