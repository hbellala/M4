package com.example.hemanthbellala.m4cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataItemDetailActivity extends AppCompatActivity {
    private SightingDataItem mItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_item_detail);

        int index = getIntent().getIntExtra("index", 1);
        mItem = Model.getInstance().getItemById(index);

        ((TextView) findViewById(R.id.detail_key)).setText("" + mItem.getKey());
        ((TextView) findViewById(R.id.date)).setText(mItem.getDate());
        ((TextView) findViewById(R.id.location_type)).setText(mItem.getLocationType());
        ((TextView) findViewById(R.id.zip)).setText(mItem.getZip());
        ((TextView) findViewById(R.id.detail_address)).setText(mItem.getAddress());
        ((TextView) findViewById(R.id.city)).setText(mItem.getCity());
        ((TextView) findViewById(R.id.borough)).setText(mItem.getBorough());
        ((TextView) findViewById(R.id.latitude)).setText(mItem.getLatitude());
        ((TextView) findViewById(R.id.longitude)).setText(mItem.getLongitude());

    }
}
