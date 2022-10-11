package com.example.btgk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Food> {
    Context cM;
    public ListAdapter( Context context, ArrayList<Food> foodArrayList) {
        super(context, R.layout.layoutitem,foodArrayList);
        cM = context;
    }


    @NonNull
    @Override
    public android.view.View getView(int position, @Nullable android.view.View convertView, @NonNull ViewGroup parent) {
        Food fd = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layoutitem, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.image1);
        TextView title = convertView.findViewById(R.id.title);
        TextView content = convertView.findViewById(R.id.content);
        TextView money = convertView.findViewById(R.id.money);




        imageView.setImageResource(fd.imageId);
        title.setText(fd.title);
        content.setText(fd.content);
        money.setText(fd.money);

        return convertView;
    }
}
