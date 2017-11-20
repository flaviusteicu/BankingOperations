package com.example.flavius.bankingoperations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Flavius on 20-Nov-17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.CardViewHolder> {

    ArrayList<BankAccounts> accounts;

    public Adapter(ArrayList<BankAccounts> accounts) {

        this.accounts = accounts;
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {

        public TextView cardOwner;
        public TextView accountIDTextView;

        public CardViewHolder(View itemView) {
            super(itemView);
            cardOwner = itemView.findViewById(R.id.cardTextViewID);
            accountIDTextView = itemView.findViewById(R.id.textViewAccountID);

        }
    }



    public void showAccounts() {

        for (int i = 0; i < DatabaseProvider.listOfBankAccounts.size(); i++) {

            BankAccounts accountsOwner = DatabaseProvider.listOfBankAccounts.get(i);

            for (int j = 0; j < accountsOwner.personID.size(); j++) {

                if (accountsOwner.personID.get(j) == Login.currentUser.personID) {

                    accounts.add(DatabaseProvider.listOfBankAccounts.get(i));

                }
            }

        }
        notifyDataSetChanged();
    }


    @Override
    public Adapter.CardViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.account_cardview_layout, parent, false);
        final CardViewHolder myViewHolder = new CardViewHolder(itemView);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent myIntent = new Intent(context, BankingOperationsActivity.class);
                //myIntent.putExtra("Account ID",);
                context.startActivity(myIntent);
            }
        });

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(Adapter.CardViewHolder holder, int position) {

        holder.cardOwner.setText(Login.currentUser.personName);
        holder.accountIDTextView.setText("Account ID " + accounts.get(position).bankAccountID);

    }


    @Override
    public int getItemCount() {
        return accounts.size();
    }


}
