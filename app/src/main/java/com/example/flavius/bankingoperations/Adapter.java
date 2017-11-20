package com.example.flavius.bankingoperations;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        public CardViewHolder(View itemView) {
            super(itemView);
            cardOwner = itemView.findViewById(R.id.cardTextViewID);
        }
    }


    public void showAccounts(){

        for(int i = 0;i<DatabaseProvider.listOfBankAccounts.size();i++){

            BankAccounts accountsOwner = DatabaseProvider.listOfBankAccounts.get(i);

            if( accountsOwner.bankAccountID == Login.currentUser.personID ) {

                accounts.add(DatabaseProvider.listOfBankAccounts.get(i));

            }

        }

    }


    @Override
    public Adapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.account_cardview_layout, parent,false);
        CardViewHolder myViewHolder = new CardViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(Adapter.CardViewHolder holder, int position) {

        holder.cardOwner.setText(Login.currentUser.personName);

    }

    @Override
    public int getItemCount() {
        return accounts.size();
    }


}
