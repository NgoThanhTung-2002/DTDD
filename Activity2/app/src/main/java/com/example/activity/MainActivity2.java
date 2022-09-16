package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public static final String NAME ="NAME";
    public static final String MASV = "MASV";
    private TextView nameText, masvText;
    private String name;
    private int masv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameText = findViewById(R.id.mName1);
        masvText = findViewById(R.id.mMaSV);

        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        masv = i.getIntExtra(MASV,0);

        nameText.setText("Hi! " + name);
        masvText.setText("Ma sv: "+ masv);
    }
}