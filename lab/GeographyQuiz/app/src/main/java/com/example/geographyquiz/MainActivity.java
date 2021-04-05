package com.example.geographyquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void ShowResults(View view) {
        int result = 0;
        TextView resultView = findViewById(R.id.result_view);
        RadioGroup[] radioGroups = new RadioGroup[10];
        String[] answers = new String[10];

        radioGroups[0] = findViewById(R.id.group_1);
        radioGroups[1] = findViewById(R.id.group_2);
        radioGroups[2] = findViewById(R.id.group_3);
        radioGroups[3] = findViewById(R.id.group_4);
        radioGroups[4] = findViewById(R.id.group_5);
        radioGroups[5] = findViewById(R.id.group_6);
        radioGroups[6] = findViewById(R.id.group_7);
        radioGroups[7] = findViewById(R.id.group_8);
        radioGroups[8] = findViewById(R.id.group_9);
        radioGroups[9] = findViewById(R.id.group_10);

        answers[0] = "Σωστό";
        answers[1] = "Λάθος";
        answers[2] = "Λάθος";
        answers[3] = "Σωστό";
        answers[4] = "Σωστό";
        answers[5] = "Λάθος";
        answers[6] = "Λάθος";
        answers[7] = "Λάθος";
        answers[8] = "Λάθος";
        answers[9] = "Σωστό";

        for (int i = 0; i < radioGroups.length; i++) {
            RadioButton radioButton = findViewById(radioGroups[i].getCheckedRadioButtonId());

            if (radioButton.getText().toString().equals(answers[i]))
                result++;
        }

        resultView.setText("Βρήκατε: " + result + " σώστες απαντήσεις");
    }
}