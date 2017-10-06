package com.example.hemanthbellala.m4cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DataItemDetailActivity extends AppCompatActivity {
    private SightingDataItem mItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_item_detail);

        int index = getIntent().getIntExtra("index", 1);
        mItem = Model.getInstance().getItemById(index);


    }
}
