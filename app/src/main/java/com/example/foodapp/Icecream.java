package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Icecream extends AppCompatActivity implements View.OnClickListener {

    ArrayList<String> selectedItems = new ArrayList<>();

    CardView c1, c2, c3, c4;
    Button addtocartc, addtocarts, addtocartv,addtocartbc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecream);

        addtocartc = findViewById(R.id.addtocartbutton3);
        addtocarts = findViewById(R.id.addtocartbutton2);
        addtocartv = findViewById(R.id.addtocartbutton);
        addtocartbc=findViewById(R.id.addtocartbutton4);

        c1 = findViewById(R.id.cardview1);
        c2 = findViewById(R.id.cardview2);
        c3 = findViewById(R.id.cardview3);
        c4 = findViewById(R.id.cardview4);

        addtocartc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Icecream = "Chocolate   price: 80";
                selectedItems.add(Icecream);
                openCartActivity();
            }
        });

        addtocarts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Icecream = "Strawberry  price: 100";
                selectedItems.add(Icecream);
                openCartActivity();
            }
        });

        addtocartv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Icecream = "vanilla   price: 60";
                selectedItems.add(Icecream);
                openCartActivity();
            }
        });

        addtocartbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Icecream = "Butter coach    price: 60";
                selectedItems.add(Icecream);
                openCartActivity();
            }
        });
    }

    private void openCartActivity() {
        Intent intent = new Intent(Icecream.this, cart.class);
        intent.putStringArrayListExtra("SelectedItems", selectedItems);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }
}
