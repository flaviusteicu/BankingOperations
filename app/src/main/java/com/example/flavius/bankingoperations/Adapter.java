package com.example.flavius.bankingoperations;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Flavius on 20-Nov-17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.CardViewHolder> {


    public static class CardViewHolder extends RecyclerView.ViewHolder {

        public TextView cardOwner;

        public CardViewHolder(View itemView) {
            super(itemView);
            cardOwner = itemView.findViewById(R.id.cardTextViewID);
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
        return 0;
    }


}
