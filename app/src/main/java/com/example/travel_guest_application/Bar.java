package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Bar extends AppCompatActivity {

    Button bar_book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        // Find the "fine_dining_book" button by its id
        bar_book = findViewById(R.id.fine_dining_book);

        // Set an OnClickListener on the "fine_dining_book" button
        bar_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the "resturanat_Booking_from" activity when the button is clicked
                startActivities(new Intent[]{new Intent(Bar.this, resturanat_Booking_from.class)});
            }
        });
    }
}