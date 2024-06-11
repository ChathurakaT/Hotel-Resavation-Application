package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class New_Password_Page extends AppCompatActivity {

    Button New_Login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password_page);


        // Initialize the "New Login" button
        New_Login_btn = findViewById( R.id.New_Login_btn);

        // Set a click listener for the "New Login" button
        New_Login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Dashboard_page activity
                startActivities(new Intent[]{new Intent(New_Password_Page.this, Dashboard_page.class)});
            }
        });
    }
}