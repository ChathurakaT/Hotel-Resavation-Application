package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import androidx.annotation.RequiresApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class information_form extends AppCompatActivity {

    private static final String CHANNEL_ID = "book_channel";
    private static final int NOTIFICATION_ID = 1;

    Button book_btn01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_form);

        book_btn01 = findViewById(R.id.book_btn01);

        // Set OnClickListener on the book button to start the Dashboard_page activity
        book_btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(information_form.this, Dashboard_page.class)});
            }
        });



        // Set OnClickListener on the book button to show a notification
        Button bookButton = findViewById(R.id.book_btn01);
        bookButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                showNotification();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void showNotification() {
        // Create a notification channel for Android Oreo and above
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Book Channel";
            String description = "Channel for booking notifications";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

        // Build the notification
        Notification.Builder builder = new Notification.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.baseline_check_box_24)
                .setContentTitle("Book Your Room")
                .setContentText("Click here to book your room")
                .setAutoCancel(true);

        // Show the notification
        NotificationManager notificationManager = getSystemService(NotificationManager.class);
        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }
}
