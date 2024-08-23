package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class payments extends AppCompatActivity implements View.OnClickListener{
      Button payonline,cashondelivery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
        payonline=findViewById(R.id.payonline);
        cashondelivery=findViewById(R.id.cashonDelivery);

        payonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(payments.this,payonline.class);
                startActivity(intent);
            }
        });

        cashondelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement cash on delivery logic
                // Implement payment logic for online payment
                Intent intent=new Intent(payments.this,Orderplaced.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}