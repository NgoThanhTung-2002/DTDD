package com.example.bt_giuaky_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Insets;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    Button flowme;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        logout = findViewById(R.id.logoutbtn);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentL = new Intent(Profile.this, Signin.class);
                startActivity(intentL);
                finish();
                Toast.makeText(Profile.this, "Succesfully Logout", Toast.LENGTH_SHORT).show();
            }
        });
    }
}