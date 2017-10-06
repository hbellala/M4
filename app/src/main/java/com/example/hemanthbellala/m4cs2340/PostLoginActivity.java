package com.example.hemanthbellala.m4cs2340;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Created by hemanthbellala on 9/25/17.
 */

public class PostLoginActivity extends AppCompatActivity {
    public static String TAG = "PostLoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postlogin);
        Button logoutButton = (Button) findViewById(R.id.logout_button);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToWelcomeScreen();
            }
        });
    }

    private void goToWelcomeScreen() {
        startActivity(new Intent(this, WelcomeActivity.class));
    }

    public void onLoadButtonPressed(View view) {
        readSDFile();
        Intent intent = new Intent(this, DataItemListActivity.class);
        startActivity(intent);
    }

    private void readSDFile() {
        Log.d(this.TAG, "open readSDFile() method");
        Model model = Model.getInstance();
        Log.d(this.TAG, "model instance made");

        try {
            InputStream is = getResources().openRawResource(R.raw.rat_sightings);
            Log.d(this.TAG, "inputstream object made");
            BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            Log.d(this.TAG, "bufferedReader object made");

            String line;
            br.readLine(); //get rid of header line
            int count = 0;
            while ((line = br.readLine()) != null) {
                //Log.d(this.TAG, line);
                String[] tokens = line.split(",");
                if (tokens.length < 51) {
                    continue;
                }
                try {
                    if (tokens[0] != null) {
                        model.addSighting(new SightingDataItem(count, Integer.parseInt(tokens[0]), tokens[1], tokens[7], tokens[8], tokens[9],
                                tokens[16], tokens[23], tokens[49], tokens[50]));
                    }

                } catch (Exception e) {
                    Log.e(this.TAG, "error reading assets", e);
                }


            }
            br.close();
        } catch (Exception e) {
            Log.e(PostLoginActivity.TAG, "error reading assets", e);
        }

    }
}
