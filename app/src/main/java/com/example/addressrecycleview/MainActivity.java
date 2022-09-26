package com.example.addressrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String> address = new ArrayList<>();
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);
        AddressAdapter adapter = new AddressAdapter(address);
        address.add("ул. Курманжан Датка 55");
        address.add("ул. М.Айткулова 23");
        address.add("ул. Абдыкадырова 216");
        address.add("ул. Балтагулова 67");
        address.add("ул. Баянов 12");
        address.add("ул. Джунусалива 34");
        address.add("ул. Салиева 44а");
        address.add("ул. Ленина 10");
        address.add("ул. Жумабека 26");
        address.add("ул. Иманалиева 68");
        address.add("ул. Иманова 90");
        address.add("ул. Ахунбаева 11");
        address.add("ул. Араванская 50");

        recyclerView.setAdapter(adapter);
    }
}