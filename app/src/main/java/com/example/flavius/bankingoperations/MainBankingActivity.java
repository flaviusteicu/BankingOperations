package com.example.flavius.bankingoperations;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainBankingActivity extends AppCompatActivity {

    EditText loginUser;
    EditText loginPassword;
    TextView cardUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_banking);

        if (DatabaseProvider.listOfPersons == null) {
            DatabaseProvider.initDataBase();
        }

        loginUser = findViewById(R.id.userID);
        loginPassword = findViewById(R.id.passwordID);
        cardUsername = findViewById(R.id.cardTextViewID);

    }

    public void logingButtonClick(View view) {

        if (Login.validate(loginUser.getText().toString(), loginPassword.getText().toString())) {

            Intent myIntent = new Intent(getApplicationContext(), BankAccountsActivity.class);
            startActivity(myIntent);
            finish();
            return;
        }

        Toast.makeText(getApplicationContext(), "Invalid credentials", Toast.LENGTH_SHORT).show();

    }


}
