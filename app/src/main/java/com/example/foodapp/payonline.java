package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class payonline extends AppCompatActivity implements View.OnClickListener{
     CardView c1, c2, c3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payonline);
        c1=findViewById(R.id.googlepay);
        c2=findViewById(R.id.phonepe);
        c3=findViewById(R.id.paytm3);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(payonline.this, Orderplaced.class);
                startActivity(intent);


            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(payonline.this, Orderplaced.class);
                startActivity(intent);

            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(payonline.this, Orderplaced.class);
                    startActivity(intent);

                }

        });


    }

    @Override
    public void onClick(View v) {

    }
}