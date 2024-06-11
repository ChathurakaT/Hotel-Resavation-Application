package com.example.travel_guest_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register_page extends AppCompatActivity {

    EditText signup_email, password, signup_confirm;
    Button signup, signin;
    DatabaseHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        // Initialize the EditText fields
        signup_email = (EditText) findViewById(R.id.Email_btn01);
        password = (EditText) findViewById(R.id.Password_btn01);
        signup_confirm = (EditText) findViewById(R.id.Comfom_pw_btn);
        // Initialize the buttons
        signup = (Button) findViewById(R.id.register_btn);
        // Create an instance of the DatabaseHelper class
        DB = new DatabaseHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve the entered email, password, and confirm password
                String email = signup_email.getText().toString();
                String pass = password.getText().toString();
                String repass = signup_confirm.getText().toString();

                if(email.equals("")||pass.equals("")||repass.equals(""))
                    // Display a toast message if any field is empty
                    Toast.makeText(Register_page.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        // Check if the email is already registered
                        Boolean checkuser = DB.checkEmail(email);
                        if(checkuser==false){
                            // Insert the new user into the database
                            Boolean insert = DB.insertData(email, pass );
                            if(insert==true){
                                // Display a success message and navigate to the Dashboard page
                                Toast.makeText(Register_page.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),Dashboard_page.class);
                                startActivity(intent);
                            }else{
                                // Display a failure message if registration failed
                                Toast.makeText(Register_page.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            // Display a message if the user already exists
                            Toast.makeText(Register_page.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        // Display a message if the passwords do not match
                        Toast.makeText(Register_page.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                } }
        });

    }
}