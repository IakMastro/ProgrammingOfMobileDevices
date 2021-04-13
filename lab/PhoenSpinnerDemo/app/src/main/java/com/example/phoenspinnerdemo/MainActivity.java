package com.example.phoenspinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.label_spinner);
        if (spinner != null) spinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.label_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        if (spinner != null)
            spinner.setAdapter(adapter);
    }

    public void showNumber(View view) {
        EditText phone = findViewById(R.id.phone_number);
        String phoneNumber = phone.getText().toString();

        TextView textView = findViewById(R.id.textSelect);
        textView.setText(phoneNumber);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String type = String.valueOf(parent.getItemAtPosition(position));

        TextView phoneView = findViewById(R.id.phoneSelect);
        phoneView.setText(type);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}