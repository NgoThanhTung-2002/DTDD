package com.example.bt_giuaky_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class ListSoccer extends AppCompatActivity {

    private RecyclerView rcvUser;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_soccer);

        rcvUser = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);


    }
    private List<User> getListUser(){
        List<User> list = new ArrayList<>();

        list.add(new User(R.drawable.arsenal, "Arsenal"));
        list.add(new User(R.drawable.bayern_munchen, "Bayern_Munchen"));
        list.add(new User(R.drawable.atletico_madrid_logo, "Atletico_Madrid"));
        list.add(new User(R.drawable.manchester_city_fc, "Manchester City"));
        list.add(new User(R.drawable.ac_milan, "AC Milan"));
        list.add(new User(R.drawable.real_madrid_logo, "Real Madrid"));
        list.add(new User(R.drawable.borussia_dortmund, "Borussia Dortmund"));
        list.add(new User(R.drawable.lfc, "Liverpool"));
        list.add(new User(R.drawable.juventus_fc, "Juventus"));
        list.add(new User(R.drawable.logoman, "Manchester United"));



        list.add(new User(R.drawable.arsenal, "Arsenal"));
        list.add(new User(R.drawable.bayern_munchen, "Bayern_Munchen"));
        list.add(new User(R.drawable.atletico_madrid_logo, "Atletico_Madrid"));
        list.add(new User(R.drawable.manchester_city_fc, "Manchester City"));
        list.add(new User(R.drawable.ac_milan, "AC Milan"));
        list.add(new User(R.drawable.real_madrid_logo, "Real Madrid"));
        list.add(new User(R.drawable.borussia_dortmund, "Borussia Dortmund"));
        list.add(new User(R.drawable.lfc, "Liverpool"));


        return list;
    }
}