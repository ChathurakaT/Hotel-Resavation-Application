package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgetPassword_Page extends AppCompatActivity {

    Button Sent_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password_page);


        // Initialize the "Sent" button
        Sent_btn = findViewById(R.id.Sent_btn);

        // Set a click listener for the "Sent" button
        Sent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the New_Password_Page activity
                startActivities(new Intent[]{new Intent(ForgetPassword_Page.this, New_Password_Page.class)});
            }
        });
    }
}
