package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameText, masvText;
    private Button button;
    private String name;
    private int masv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.mName);
        masvText = findViewById(R.id.mMaSv);
        button = findViewById(R.id.firstactivitybtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }

            private void sendData() {
                name = nameText.getText().toString().trim();
                masv = Integer.parseInt(masvText.getText().toString().trim());

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra(MainActivity2.NAME, name);
                i.putExtra(MainActivity2.MASV, masv);

                startActivity(i);
            }
        });

    }
}