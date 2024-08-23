package com.example.foodapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    SearchView sv;
    ListView lv;
    AutoCompleteTextView atv;
    BottomNavigationView bnv;
    View fc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        atv = findViewById(R.id.atv_location);
        bnv=findViewById(R.id.bottomNavigationView);
        fc=findViewById(R.id.fragmentContainerView);

        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView); // Replace with your NavHostFragment ID
        NavigationUI.setupWithNavController(bnv, navController);

    }

    }