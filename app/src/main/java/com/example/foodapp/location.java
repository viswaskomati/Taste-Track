package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class location extends AppCompatActivity {
    TextView tv1, tv2;
    AutoCompleteTextView atv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView1);
        atv = findViewById(R.id.atv_location);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,cities);
        atv.setAdapter(adapter);
        atv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                String selectedCity = (String) parent.getItemAtPosition(position);
                Intent intent = new Intent(location.this, MainActivity.class);
                startActivity(intent);
            }
        });}


    String cities[] = {"Hyderabad", "khammam", "Visakhapatnam", "guntur", "vijayawada", "Visakhapatnam"};

}
