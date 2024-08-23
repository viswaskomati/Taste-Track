package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    TextView tv1, tv2;
    EditText et1, et2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv1 = findViewById(R.id.textView2);
        tv2 = findViewById(R.id.textView3);
        et1 = findViewById(R.id.editTextTextEmailAddress);
        et2 = findViewById(R.id.editTextTextPassword2);
        b1 = findViewById(R.id.button1);
        b2=findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String enteredEmail = et1.getText().toString();
                String enteredPassword = et2.getText().toString();


                String correctEmail = "kviswas456@gmail.com";
                String correctPassword = "12345";

                if (enteredEmail.equals(correctEmail) && enteredPassword.equals(correctPassword)) {

                    Intent intent = new Intent(Login.this,location.class);
                    startActivity(intent);
                } else {

                    Toast.makeText(Login.this, "Incorrect email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,signup.class);
                startActivity(intent);



            }
        });
    }
}
