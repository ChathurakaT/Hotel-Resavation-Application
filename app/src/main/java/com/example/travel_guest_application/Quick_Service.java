package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quick_Service extends AppCompatActivity {

    Button quick_service_book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_service);

        // Initialize the "Quick Service Book" button
        quick_service_book = findViewById(R.id.quick_service_book);

        // Set a click listener for the "Quick Service Book" button
        quick_service_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the resturanat_Booking_from activity
                startActivities(new Intent[]{new Intent(Quick_Service.this, resturanat_Booking_from.class)});
            }
        });
    }
}