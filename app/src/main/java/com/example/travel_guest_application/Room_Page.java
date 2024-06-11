package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Room_Page extends AppCompatActivity {


    ImageView semi_single_room,semi_double_room;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_page);

        // Initialize the ImageViews
        semi_single_room = findViewById( R.id.semi_single_room);
        semi_single_room = findViewById(R.id.semi_single_room);
        semi_single_room.setOnClickListener(new View.OnClickListener() {
            @Override
            // Set click listener for semi_single_room
            public void onClick(View v) {
                // Start the Detail_room_semi_single activity
                startActivity(new Intent(Room_Page.this, Detail_room_semi_single.class));
            }
        });

        semi_double_room = findViewById( R.id.semi_double_room);
        semi_double_room = findViewById(R.id.semi_double_room);
        semi_double_room.setOnClickListener(new View.OnClickListener() {
            @Override
            // Set click listener for semi_double_room
            public void onClick(View v) {
                // Start the Detail_room_semi_double activity
                startActivity(new Intent(Room_Page.this, Detail_room_semi_double.class));
            }
        });
    }
}