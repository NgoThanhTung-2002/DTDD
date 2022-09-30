package com.example.bttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView1;
    EditText inputtext1;
    Button btnAdd;

    ArrayList<String> books = new ArrayList<>();
    ArrayAdapter myAdapter1;

    Integer indexVal;
    String item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = (ListView) findViewById(R.id.listviewMonHoc);
        btnAdd = (Button) findViewById(R.id.button1);
        inputtext1 = (EditText) findViewById(R.id.editText);

        // setup listview
        books.add("Lập trình C#");
        books.add("Lập trình Java");
        books.add("Cấu trúc dữ liệu & giải thuật");
        books.add("Cơ sở dữ liệu");
        books.add("Lập trình PHP");



        myAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, books);
        listView1.setAdapter(myAdapter1);

        //Add items
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringval = inputtext1.getText().toString();
                books.add(stringval);
                myAdapter1.notifyDataSetChanged();

                inputtext1.setText("");
            }
        });

        //select items
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                item = adapterView.getItemAtPosition(i).toString() + "has been selected";
                indexVal = i;
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();

            }
        });

        //Delete
        listView1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                item = adapterView.getItemAtPosition(i).toString() + "has been delete";

                books.remove(i);
                myAdapter1.notifyDataSetChanged();

                return false;
            }
        });
    }
}