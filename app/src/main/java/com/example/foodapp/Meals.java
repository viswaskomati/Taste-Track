package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Meals extends AppCompatActivity implements View.OnClickListener {

    ArrayList<String> selectedItems = new ArrayList<>();

    CardView c1, c2, c3, c4;
    Button addtocartsm, addtocartm, addtocartcm, addtocartmm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);

        addtocartsm = findViewById(R.id.addtocartbutton3);
        addtocartm = findViewById(R.id.addtocartbutton2);
        addtocartcm = findViewById(R.id.addtocartbutton);
        addtocartmm = findViewById(R.id.addtocartbutton4);  // Initialize the addtocartmm button

        c1 = findViewById(R.id.cardview1);
        c2 = findViewById(R.id.cardview2);
        c3 = findViewById(R.id.cardview3);
        c4 = findViewById(R.id.cardview4);

        addtocartsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mealType = "Special Meals Price: 120";
                selectedItems.add(mealType);

                Intent intent = new Intent(Meals.this, cart.class);  // Assuming the cart activity is named Cart
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);
            }
        });

        addtocartm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meal = "Meals Price: 70";
                selectedItems.add(meal);

                Intent intent = new Intent(Meals.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);

            }
        });

        addtocartcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meal = "Chicken Meals Price: 180";
                selectedItems.add(meal);

                Intent intent = new Intent(Meals.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);

            }
        });

        addtocartmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meal = "Mutton Meals Price: 180";
                selectedItems.add(meal);

                Intent intent = new Intent(Meals.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onClick(View v) {
        // Implement the onClick logic if needed
    }
}
