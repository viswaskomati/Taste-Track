package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class resofpizza extends AppCompatActivity implements RecyclerViewInterface {
    CardView c1,c2,c3,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resofpizza);
            c1=findViewById(R.id.cardview1);
            c2=findViewById(R.id.cardview2);
            c3=findViewById(R.id.cardview3);
            c4=findViewById(R.id.cardview4);
            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =new Intent(resofpizza.this,pizza.class);
                    startActivity(intent);

                }

            });
            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =new Intent(resofpizza.this,pizza.class);
                    startActivity(intent);

                }
            });
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =new Intent(resofpizza.this,pizza.class);
                    startActivity(intent);


                }
            });
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =new Intent(resofpizza.this,pizza.class);
                    startActivity(intent);

                }
            });




        }



    @Override
    public void onItemClick(int position) {

    }
}