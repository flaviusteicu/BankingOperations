package com.example.flavius.bankingoperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BankingOperationsActivity extends AppCompatActivity {

    int balanceAccoutnID = 11;
    //int balanceAccoutnID = Login.currentUser.personID;
    TextView balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banking_operations);
        balance = findViewById(R.id.textView4);


    }

    public void checkBalanceButton(View view){

        BankingOperations checkingBalance = new BankingOperations();
        double balanceToPrint = checkingBalance.checkBalance(balanceAccoutnID);
        balance.setText(String.valueOf(balanceToPrint));

    }

    public void withdrawMoneyButton(View view){

        BankingOperations withdrawMoney = new BankingOperations();


    }


}
