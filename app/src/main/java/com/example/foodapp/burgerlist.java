package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class burgerlist extends AppCompatActivity implements View.OnClickListener{


    ArrayList<String> selectedItems = new ArrayList<>();

    CardView c1, c2, c3, c4;
    Button addtocartcb, addtocartcripsyb, addtocartvB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgerlist);

        addtocartcb = findViewById(R.id.addtocartbutton3);
        addtocartcripsyb = findViewById(R.id.addtocartbutton2);
        addtocartvB = findViewById(R.id.addtocartbutton);

        c1 = findViewById(R.id.cardview1);
        c2 = findViewById(R.id.cardview2);
        c3 = findViewById(R.id.cardview3);


        addtocartcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String burger = "chicken Burger";
                selectedItems.add(burger);

                Intent intent = new Intent(burgerlist.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);
            }
        });

        addtocartcripsyb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String burger = "crispy burger";
                selectedItems.add(burger);

                Intent intent = new Intent(burgerlist.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);

            }
        });

        addtocartvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String burger = "veg burger";
                selectedItems.add(burger);

                Intent intent = new Intent(burgerlist.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);

            }
        });


    }

    @Override
    public void onClick(View v) {

    }

}