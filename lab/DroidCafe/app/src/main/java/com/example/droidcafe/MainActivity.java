package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("NonConstantResourceId")
    public void order(View view) {
        switch (view.getId()) {
            case R.id.donut:
                Toast.makeText(this, R.string.donut_order_message,
                        Toast.LENGTH_SHORT).show();
                startNewActivity("donut");
                break;

            case R.id.froyo:
                Toast.makeText(this, R.string.froyo_order_message,
                        Toast.LENGTH_SHORT).show();
                startNewActivity("froyo");
                break;

            case R.id.iceCream:
            case R.id.iceCream2:
                Toast.makeText(this, R.string.ice_cream_order_message,
                        Toast.LENGTH_SHORT).show();
                startNewActivity("ice cream");
                break;

            case R.id.coffee:
                Toast.makeText(this, R.string.coffee_order_message,
                        Toast.LENGTH_SHORT).show();
                startNewActivity("coffee");
                break;
        }
    }

    public void startNewActivity(String order) {
        Intent i = new Intent(this, OrderActivity.class);
        i.putExtra("Order", order);
        startActivity(i);
    }
}