package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Casual_dining extends AppCompatActivity {

    Button Casual_dining_book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casual_dining);

        // Find the "Casual_dining_book" button by its id
        Casual_dining_book = findViewById(R.id.Casual_dining_book);

        // Set an OnClickListener on the "Casual_dining_book" button
        Casual_dining_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the "resturanat_Booking_from" activity when the button is clicked
                startActivities(new Intent[]{new Intent(Casual_dining.this, resturanat_Booking_from.class)});
            }
        });
    }
}