package com.example.droidcafe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);
    }

    @SuppressLint("NonConstantResourceId")
    public void delivery(View view) {
        String order = getIntent().getStringExtra("Order");

        switch (view.getId()) {
            case R.id.radio_button_same_day:
                Toast.makeText(this, "Same day: " + order,
                        Toast.LENGTH_SHORT).show();
                showMap();
                break;

            case R.id.radio_button_next_day:
                Toast.makeText(this, "Different day: " + order,
                        Toast.LENGTH_SHORT).show();
                showMap();
                break;

            case R.id.radio_button_pick_up:
                Toast.makeText(this, "Pick up: " + order,
                        Toast.LENGTH_SHORT).show();
                showMap();
                break;
        }
    }

    public void showMap() {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);

        String data = getString(R.string.athens);
        i.setData(Uri.parse(data));

        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        } else {
            System.err.println("Map not loaded...");
        }
    }
}
