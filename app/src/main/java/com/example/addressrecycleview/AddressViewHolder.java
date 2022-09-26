package com.example.addressrecycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewAnimal;

    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewAnimal= itemView.findViewById(R.id.textView_address);
    }
    public void bind(String address){
        textViewAnimal.setText(address);
    }
}
