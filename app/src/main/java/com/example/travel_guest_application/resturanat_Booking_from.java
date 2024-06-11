package com.example.travel_guest_application;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class resturanat_Booking_from extends AppCompatActivity {

    private static final String CHANNEL_ID = "book_channel";
    private static final int NOTIFICATION_ID = 1;

    Button book_btn02;
    EditText edFirstName, edLastName, edEmail,edContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturanat_booking_from);


        book_btn02 = findViewById(R.id.book_btn02);
        edFirstName = findViewById(R.id.first_name);
        edLastName = findViewById(R.id.last_name);
        edEmail = findViewById(R.id.email);
        edContact = findViewById(R.id.phone_number);

        book_btn02.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)

            @Override
            public void onClick(View v) {
                showNotification();
                String FirstName = edFirstName.getText().toString();
                String Lasstname = edLastName.getText().toString();
                String Email = edEmail.getText().toString();
                String Contact = edContact.getText().toString();
                // Creating Database object to perform database operations
                Database db = new Database(getApplicationContext(), "bookings", null,1);
                db.book(FirstName,Lasstname,Email, Integer.parseInt(Contact));
                startActivities(new Intent[]{new Intent(resturanat_Booking_from.this, Dashboard_page.class)});
            }
        });



//        Button bookButton = findViewById(R.id.book_btn02);
//        bookButton.setOnClickListener(new View.OnClickListener() {
//
//            @RequiresApi(api = Build.VERSION_CODES.O)
//            @Override
//            public void onClick(View v) {
//                showNotification();
//            }
//        });
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
                .setContentTitle("Book Your Resturanat Resavation")
                .setContentText("Click here to book your restuarant")
                .setAutoCancel(true);

        // Show the notification
        NotificationManager notificationManager = getSystemService(NotificationManager.class);
        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }

}