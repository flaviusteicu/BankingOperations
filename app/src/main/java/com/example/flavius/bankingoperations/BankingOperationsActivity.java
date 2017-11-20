package com.example.flavius.bankingoperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BankingOperationsActivity extends AppCompatActivity {


    int balanceAccountID;
    TextView balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banking_operations);
        balance = findViewById(R.id.textView4);


    }

    public void checkBalanceButton(View view){

        /*for(int i=0;i<Login.currentUser.bankAccountsIDs.size();i++){

            if(Login.currentUser.bankAccountsIDs.get(i) == )

        }*/

       /* BankingOperations checkingBalance = new BankingOperations();
        double balanceToPrint = checkingBalance.checkBalance(balanceAccountID);
        balance.setText(String.valueOf(balanceToPrint));*/

    }

    public void withdrawMoneyButton(View view){

        BankingOperations withdrawMoney = new BankingOperations();


    }


}
