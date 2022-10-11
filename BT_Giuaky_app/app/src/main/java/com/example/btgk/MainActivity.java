package com.example.btgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.btgk.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends DrawerBaseActivity {

    ActivityMainBinding binding;
    String[] fruitList ={"AC_Milan","Chelsea","Bayern Munchen","ArSenal","Real Madrid", "Atletico Madrid",
    "Juventus","WestHam United "};
    int fruitImages []= new int[]{R.drawable.ac_milan, R.drawable.chelsea_logo, R.drawable.bayern_munchen,
            R.drawable.arsenal, R.drawable.real_madrid_logo, R.drawable.atletico_madrid_logo, R.drawable.juventus_fc,
    R.drawable.west_ham_united_fc};
    String[] content ={
            "AC_Milan là câu lạc bộ bóng đá mạnh top đầu thế giới",
            "Chelsea là câu lạc bộ bóng đá mạnh top đầu thế giới",
            "Bayern_munchen là câu lạc bộ bóng đá mạnh top đầu thế giới",
            "Arsenal là câu lạc bộ bóng đá mạnh top đầu thế giới",
            "Real Madrid là câu lạc bộ bóng đá mạnh top đầu thế giới",
            "Atletico Madrid là câu lạc bộ bóng đá mạnh top đầu thế giới",
            "Juventus Football Club (tiếng Latinh: iuventūs, phát âm tiếng Ý: [juˈvɛntus], tạm dịch: \"Tuổi trẻ\"), thường được gọi là Juventus hay Juve là một câu lạc bộ bóng đá chuyên nghiệp của Ý có trụ sở tại Torino, Piemonte.",
            "Westham united là câu lạc bộ bóng đá mạnh top đầu thế giới",
            };
    String[] money = {"10k$","80k$","1t$","87k$","99k$","85k$","124k$","2t$"};
    ListView lv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Food> foodArrayList = new ArrayList<>();
        for(int i = 0 ; i< fruitList.length; i++ ){
            Food fd = new Food(fruitList[i],content[i], money[i], fruitImages[i],"","");
            foodArrayList.add(fd);
        }
        ArrayList<Food> foods = new ArrayList<>();
        for(int i = 0 ; i< fruitList.length; i++ ){
            Food fd = new Food(fruitList[i],content[i], money[i], fruitImages[i],"","");
            foodArrayList.remove(fd);
        }
        ListAdapter listAdapter = new ListAdapter(MainActivity.this,foodArrayList);
        binding.lv.setAdapter(listAdapter);
        binding.lv.setClickable(true);
        binding.lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent kk =new Intent(MainActivity.this, Football.class);
                kk.putExtra("title",fruitList[position]);
                kk.putExtra("content",content[position]);
                kk.putExtra("money",money[position]);
                kk.putExtra("imageid",fruitImages[position]);
                startActivity(kk);
            }
        });

    }
}