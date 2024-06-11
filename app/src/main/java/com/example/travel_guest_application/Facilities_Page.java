package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Facilities_Page extends AppCompatActivity {


    ImageView room_btn;
    ImageView resturant_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities_page);

        // Initialize the room and restaurant image views
        room_btn = findViewById( R.id.room_btn);
        resturant_btn = findViewById(R.id.resturant_btn);
        room_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Room_Page activity
                startActivity(new Intent(Facilities_Page.this, Room_Page.class));
            }
        });

        resturant_btn = findViewById(R.id.resturant_btn);

        // Set a click listener for the restaurant image view
        resturant_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the restaurant_types activity
                startActivity(new Intent(Facilities_Page.this, restaurant_types.class));
            }
        });

    }
}