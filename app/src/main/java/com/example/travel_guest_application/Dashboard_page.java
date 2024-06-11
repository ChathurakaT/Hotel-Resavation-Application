package com.example.travel_guest_application;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;
public class Dashboard_page extends AppCompatActivity{
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedIntenceState) {
        super.onCreate(savedIntenceState);
        setContentView(R.layout.activity_dashboard_page);

        //navigate main functions
        Button about_us_btn2,Facilities_btn,Loaction_btn,Gallery_btn,Rating_btn;

        about_us_btn2 = findViewById( R.id.about_us_btn2);

        about_us_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(Dashboard_page.this, About_US_Page.class)});
            }
        });

        Facilities_btn = findViewById( R.id.Facilities_btn);

        Facilities_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(Dashboard_page.this, Facilities_Page.class)});
            }
        });

        Loaction_btn = findViewById( R.id.Loaction_btn);

        Loaction_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(Dashboard_page.this, Location_page.class)});
            }
        });

        Gallery_btn = findViewById( R.id.Gallery_btn);

        Gallery_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(Dashboard_page.this, Gallery_page.class)});
            }
        });

        Rating_btn = findViewById( R.id.Rating_btn);

        Rating_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(Dashboard_page.this, Rating_Page.class)});
            }
        });


        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case  R.id.nav_Home:

                        Intent intent = new Intent(Dashboard_page.this, Dashboard_page.class);
                        startActivity(intent);
                        break;

                    case R.id.nav_profile:
                        Intent intent1 = new Intent(Dashboard_page.this,Log_In_Page.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_about:
                        Intent intent2 = new Intent(Dashboard_page.this,Rating_Page.class);
                        startActivity(intent2);
                        break;

                    case R.id.Privacy:
                        Intent intent3 = new Intent(Dashboard_page.this,Rating_Page.class);
                        startActivity(intent3);
                        break;

                    case  R.id.nav_logout:{
                        Intent intent4 = new Intent(Dashboard_page.this,Rating_Page.class);
                        startActivity(intent4);

                    }
                    break;
                }
                return false;
            }

        });

    }
    public void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerlayout);
        Toolbar toolbar = findViewById(R.id.topAppBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enable the Up button
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_menu_24); // Set the navigation icon
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }

}