package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Detail_room_semi_double extends AppCompatActivity {

    Button book_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_room_semi_double);

        // Initialize the book button
        book_btn = findViewById(R.id.book_btn);

        // Set a click listener for the book button
        book_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an explicit intent to start the information_form activity
                startActivities(new Intent[]{new Intent(Detail_room_semi_double.this, information_form.class)});
            }
        });

    }
}