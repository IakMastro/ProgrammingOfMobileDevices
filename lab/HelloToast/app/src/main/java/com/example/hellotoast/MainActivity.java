package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCount = findViewById(R.id.text_view_count);
    }

    public void showToast(View view) {
        Toast toast = makeText(this, "Hello Toast", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        int count = Integer.parseInt(textViewCount.getText().toString());
        textViewCount.setText(Integer.toString(count + 1));
    }

    @SuppressLint("SetTextI18n")
    public void countDown(View view) {
        int count = Integer.parseInt(textViewCount.getText().toString());
        textViewCount.setText(Integer.toString(count - 1));
    }
}