package com.example.foodapp.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.foodapp.Biryanires;
import com.example.foodapp.R;
import com.example.foodapp.rofburger;
import com.example.foodapp.ResturantsforBiryani;
import com.example.foodapp.resoficecream;
import com.example.foodapp.resofmeals;
import com.example.foodapp.resofnaan;
import com.example.foodapp.resofpizza;
import com.example.foodapp.rofburger;

public class Home extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Home() {

    }
    // TODO: Rename and change types and number of parameters
    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView Biryani = rootView.findViewById(R.id.imageView);
        ImageView Burger = rootView.findViewById(R.id.imageView7);
        ImageView butternaan = rootView.findViewById(R.id.imageView8);
        ImageView pizza = rootView.findViewById(R.id.imageView9);
        ImageView icecream = rootView.findViewById(R.id.imageView10);
        ImageView meals = rootView.findViewById(R.id.imageView11);



        Biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the TextView is clicked
                Intent intent = new Intent(getActivity(), ResturantsforBiryani.class);
                startActivity(intent);
            }

        });
        Burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        butternaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), resofnaan.class);
                startActivity(intent);

              ;
            }
        });
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), resofpizza.class);
                startActivity(intent);
            }

        });
        icecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity when the TextView is clicked
               Intent intent=new Intent(getActivity(), resoficecream.class);
               startActivity(intent);
            }

        });
        meals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), resofmeals.class);
                startActivity(intent);

            }

        });


        return rootView;
    }
    private void openNewActivity() {

        Intent intent = new Intent(getActivity(), rofburger.class);
        startActivity(intent);
    }

}