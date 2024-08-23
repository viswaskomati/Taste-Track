package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class cart extends AppCompatActivity {

    TextView cartitems;
    Button clear, payment;
    private static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        payment = findViewById(R.id.pay);
        clear = findViewById(R.id.clear);
        cartitems = findViewById(R.id.listofitemsincart);

        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        String savedItems = preferences.getString("SelectedItems", "");

        if (!savedItems.isEmpty()) {
            cartitems.setText(savedItems);
        } else {
            cartitems.setText("No items in cart.");
        }

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartitems.setText("No items in cart.");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("SelectedItems", "");
                editor.apply();
            }
        });



        Intent intent = getIntent();
        ArrayList<String> selectedItems = intent.getStringArrayListExtra("SelectedItems");

        StringBuilder selectedText = new StringBuilder(savedItems);
        if (selectedItems != null) {
            for (String item : selectedItems) {
                selectedText.append(item).append("\n");
            }
        }


        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("SelectedItems", selectedText.toString());
        editor.apply();

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(cart.this, payments.class);
                startActivity(intent);
            }
        });
    }
}