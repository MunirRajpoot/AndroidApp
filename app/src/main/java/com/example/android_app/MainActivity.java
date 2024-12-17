package com.example.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome); // Set the XML layout file

        // Initialize Toolbar and set it as the App Bar
        Toolbar toolbar = findViewById(R.id.appBar);
        setSupportActionBar(toolbar); // Integrate Toolbar as the ActionBar

        // Initialize Buttons
        Button btnLogin = findViewById(R.id.loginButton);
        Button btnSignup = findViewById(R.id.signupButton);

        // Navigate to LoginActivity
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent); // Open the LoginActivity
            }
        });

        // Navigate to SignupActivity
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent); // Open the SignupActivity
            }
        });
    }
}
