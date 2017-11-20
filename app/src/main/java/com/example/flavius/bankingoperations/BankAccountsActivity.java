package com.example.flavius.bankingoperations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class BankAccountsActivity extends AppCompatActivity {

    private RecyclerView myRecyclerView;
    private Adapter myAdapter;
    private RecyclerView.LayoutManager myLayoutManager;

    ArrayList<BankAccounts> accounts = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_accounts);

        myRecyclerView = findViewById(R.id.recyclerViewID);

        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);



    }

    public void showAccounts(){

        for(int i = 0;i<DatabaseProvider.listOfBankAccounts.size();i++){

            BankAccounts accountsOwner = DatabaseProvider.listOfBankAccounts.get(i);

            if( accountsOwner.bankAccountID == Login.currentUser.personID ) {

                

            }

        }

    }

    public void goToOperations(View view){

        Intent myIntent = new Intent(getApplicationContext(),BankingOperationsActivity.class);
        startActivity(myIntent);

    }

}
