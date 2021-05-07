package com.example.android.browsersapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class MyFragment2 extends Fragment {
    View view;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.second_fragment, container, false);
        // get the reference of Button
        button = (Button) view.findViewById(R.id.button);
        // perform setOnClickListener on second Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // display a message by using a Toast
                Toast.makeText(getActivity(), "I said don't click me :-(", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
