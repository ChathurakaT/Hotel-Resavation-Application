package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button log_in_button,register_button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the "Log In" button
        log_in_button = findViewById( R.id.log_in_button);
        // Initialize the "Register" button
        register_button = findViewById( R.id.register_button);

        // Set a click listener for the "Log In" button
        log_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Log_In_Page activity
                startActivities(new Intent[]{new Intent(MainActivity.this, Log_In_Page.class)});
            }
        });

        // Set a click listener for the "Register" button
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Register_page activity
                startActivities(new Intent[]{new Intent(MainActivity.this, Register_page.class)});
            }
        });

        // Create an OrientationEventListener to detect orientation changes
        OrientationEventListener orientationEventListener = new OrientationEventListener(this) {
            @Override


            public void onOrientationChanged(int orientation) {

                int epsil = 10;
                int leftscape = 90;
                int rightscape = 270;

                // Check if the orientation is within epsilon range of landscape left or right
                if(epsilCheck(orientation,leftscape,epsil) || epsilCheck(orientation,rightscape,epsil)){
                    // Allow the screen orientation to be controlled by the device's sensor
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
                }
            }

            // Helper method to check if the orientation is within epsilon range of a target orientation
            private boolean epsilCheck(int orientation, int lscapeMode, int epsil){
                return orientation > lscapeMode - epsil && orientation < lscapeMode + epsil;
            }
        };

        // Enable the orientation event listener
        orientationEventListener.enable();

    }
}