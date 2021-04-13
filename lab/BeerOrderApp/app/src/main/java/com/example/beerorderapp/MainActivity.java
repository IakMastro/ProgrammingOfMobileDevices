package com.example.beerorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {
    private ArrayList<Beer> beerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.label_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        if (spinner != null)
            spinner.setAdapter(adapter);

        beerList = new ArrayList<Beer>();
        beerList.add(new Beer(spinner.getItemAtPosition(0).toString(),
                getResources().getStringArray(R.array.blond_array)));

        beerList.add(new Beer(spinner.getItemAtPosition(1).toString(),
                getResources().getStringArray(R.array.black_array)));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView brandTextView = findViewById(R.id.brandTextView);
        brandTextView.setText(beerList.get(position).toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}