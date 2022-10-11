package com.example.btgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_Login extends AppCompatActivity {

    Button button;
    TextView textViewRegister, textViewUser, textViewPass;
    CheckBox checkBox;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        sharedPreferences =getSharedPreferences("dataLogin",MODE_PRIVATE);
        // lay du lieu tu text user
        textViewUser = (TextView) findViewById(R.id.edtUser);
        // lay du lieuj tu text pass chua
        textViewPass =(TextView) findViewById(R.id.edtPass);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String user = "admin";
                String pass = "admin";
                if (textViewUser.getText().toString().equals(user) && textViewPass.getText().toString().equals(pass)){
                    Intent i = new Intent(MainActivity_Login.this, MainActivity.class);
                    Toast.makeText(MainActivity_Login.this, "Login Succesfull!", Toast.LENGTH_SHORT).show();

                    startActivity(i);
                }
                else{
                    // hien loi
                    Toast.makeText(MainActivity_Login.this, "Login Fail!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        textViewRegister = (TextView) findViewById(R.id.textViewRegister) ;
        textViewRegister.setOnClickListener(new android.view.View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity_Login.this, MainActivity_Register.class);
                startActivity(i);
            }
        });
    }
}