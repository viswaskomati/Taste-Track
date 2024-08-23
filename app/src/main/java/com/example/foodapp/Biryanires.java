package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class Biryanires extends AppCompatActivity implements View.OnClickListener {


    ArrayList<String> selectedItems = new ArrayList<>();


    CardView c1, c2, c3, c4;
    Button addtocartsp, addtocartdm, addtocartvg, addtocartmb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biryanires);

        addtocartsp = findViewById(R.id.addtocartbutton3);
        addtocartdm = findViewById(R.id.addtocartbutton2);
        addtocartvg = findViewById(R.id.addtocartbutton);
        addtocartmb = findViewById(R.id.addtocartbutton4);
        c1 = findViewById(R.id.cardview1);
        c2 = findViewById(R.id.cardview2);
        c3 = findViewById(R.id.cardview3);
        c4 = findViewById(R.id.cardview4);

        addtocartsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String biryaniType = "SPBiryani   price: 130";
                selectedItems.add(biryaniType);

                Intent intent = new Intent(Biryanires.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);
            }
        });

        addtocartdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String biryaniType = "Dum Biryani price: 300";
                selectedItems.add(biryaniType);

                Intent intent = new Intent(Biryanires.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);
            }
        });

        addtocartvg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String biryaniType = "Veg Biryani price: 270";
                selectedItems.add(biryaniType);

                Intent intent = new Intent(Biryanires.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);
            }
        });

        addtocartmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String biryaniType = "Mutton Biryani price:400";
                selectedItems.add(biryaniType);

                Intent intent = new Intent(Biryanires.this, cart.class);
                intent.putStringArrayListExtra("SelectedItems", selectedItems);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
