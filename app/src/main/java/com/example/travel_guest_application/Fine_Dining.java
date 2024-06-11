package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fine_Dining extends AppCompatActivity {

    Button fine_dining_book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine_dining);

        // Initialize the fine dining book button
        fine_dining_book = findViewById(R.id.fine_dining_book);

        // Set a click listener for the fine dining book button
        fine_dining_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the resturanat_Booking_from activity
                startActivities(new Intent[]{new Intent(Fine_Dining.this, resturanat_Booking_from.class)});
            }
        });
    }
}