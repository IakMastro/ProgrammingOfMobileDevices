package com.example.hellouniwa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {
        textView = findViewById(R.id.text_view);
        textView.setText("Wake UP!");
    }

    public void clearButton(View view) {
        textView = findViewById(R.id.text_view);
        textView.clearComposingText();
    }
}