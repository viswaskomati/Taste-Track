
package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class pizza extends AppCompatActivity implements View.OnClickListener {
    ArrayList<String> selectedItems = new ArrayList<>();

    CardView c1, c2, c3, c4;
    Button addtocartcp, addtocartchp, addtocartpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        addtocartcp = findViewById(R.id.addtocartbutton3);
        addtocartchp = findViewById(R.id.addtocartbutton2);
        addtocartpp = findViewById(R.id.addtocartbutton);

        c1 = findViewById(R.id.cardview1);
        c2 = findViewById(R.id.cardview2);
        c3 = findViewById(R.id.cardview3);
//        c4 = findViewById(R.id.cardview4);

        addtocartcp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = "chicken Pizza    price:180";
                selectedItems.add(pizza);

                Intent intent = new Intent(pizza.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);
            }
        });

        addtocartchp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = "cheese pizza     price:120";
                selectedItems.add(pizza);

                Intent intent = new Intent(pizza.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);

            }
        });

        addtocartpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = "Panner pizza   price:130";
                selectedItems.add(pizza);

                Intent intent = new Intent(pizza.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);

            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
