package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class restaurant_types extends AppCompatActivity {

    Button fine_dining,causal_dining,Quick_service,bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_types);

        // Initialize the buttons
        fine_dining = findViewById( R.id.fine_dining);

        fine_dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Fine_Dining activity
                startActivities(new Intent[]{new Intent(restaurant_types.this, Fine_Dining.class)});
            }
        });

        causal_dining = findViewById( R.id.causal_dining);

        causal_dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Casual_dining activity
                startActivities(new Intent[]{new Intent(restaurant_types.this, Casual_dining.class)});
            }
        });
        Quick_service = findViewById( R.id.Quick_service);

        Quick_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Quick_Service activity
                startActivities(new Intent[]{new Intent(restaurant_types.this, Quick_Service.class)});
            }
        });
        bar = findViewById( R.id.bar);

        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Bar activity
                startActivities(new Intent[]{new Intent(restaurant_types.this, Bar.class)});
            }
        });
    }
}