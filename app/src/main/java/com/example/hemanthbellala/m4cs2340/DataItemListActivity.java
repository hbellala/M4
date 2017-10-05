package com.example.hemanthbellala.m4cs2340;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class DataItemListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_item_list);

        Log.d("DataIemListActivity: ", "onCreate: launched");

        List<SightingDataItem> sightings = Model.getInstance().getItems();
        Log.d("DataIemListActivity: ", "onCreate: sightings length: " + sightings.size());
        Log.d("DataIemListActivity: ", "Last item: " + sightings.get(sightings.size() - 1));

//        View recyclerView = findViewById(R.id.dataitem_list);
//        assert recyclerView != null;
//        setupRecyclerView((RecyclerView) recyclerView);
//
//        ArrayAdapter<SightingDataItem> adapter = new ArrayAdapter<SightingDataItem> (
//                        this, // The current context (this activity)
//                        R.layout.activity_data_item_list, // The name of the layout ID.
//                        R.id.dataitem_list_text, // The ID of the textview to populate.
//                        Model.getInstance().getItems());
//
//        LayoutInflater inflater = this.getLayoutInflater();
//        View rootView = inflater.inflate(R.layout.activity_data_item_list, container, false);
//
//        // Get a reference to the ListView, and attach this adapter to it.
//        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
//        listView.setAdapter(mForecastAdapter);
    }




}
