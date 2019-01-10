package com.example.admin.mytimerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CitiesActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<City> cityList;
    private CitiesAdapter cityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        mRecyclerView = findViewById(R.id.recycler_view_city_list);

        cityList = new ArrayList<>();
        cityList.add(new City("Aktau","GMT+5"));
        cityList.add(new City("Almaty","GMT+6"));
        cityList.add(new City("Aqtobe","GMT+5"));
        cityList.add(new City("Arkalyk","GMT+6"));
        cityList.add(new City("Astana","GMT+6"));
        cityList.add(new City("Atyrau","GMT+5"));
        cityList.add(new City("Baikonur","GMT+6"));
        cityList.add(new City("Karaganda","GMT+6"));
        cityList.add(new City("Kostanay","GMT+6"));
        cityList.add(new City("Oral","GMT+5"));
        cityList.add(new City("Petropavl","GMT+6"));
        cityList.add(new City("Qyzylorda","GMT+6"));
        cityList.add(new City("Shymkent","GMT+6"));

        initRecyclerView();
    }

    private void initRecyclerView() {
        cityAdapter = new CitiesAdapter(this, cityList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(cityAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
