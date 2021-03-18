package org.gmele.android.examples.a01basics;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Act1 extends AppCompatActivity implements View.OnClickListener
{

    EditText EtN1;
    EditText EtN2;
    TextView TvRes;
    Button BtPlus;
    Button BtMinus;
    Button BtNext;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.act1_lay);
        System.out.println("*** ONCREATE");
        EtN1 = (EditText) findViewById (R.id.EtNum1);
        EtN2 = (EditText) findViewById (R.id.EtNum2);
        TvRes = (TextView) findViewById (R.id.TvResult);
        BtPlus = (Button) findViewById (R.id.BtPlus);
        BtMinus = (Button) findViewById (R.id.BtMinus);
        BtNext = (Button) findViewById (R.id.BtNext);
        BtPlus.setOnClickListener (this);

        BTMinHand BtH = new BTMinHand(this);
        BtMinus.setOnClickListener (BtH);
        BtNext.setOnClickListener ((v) -> {
            Intent intent = new Intent (getApplicationContext (), Act2.class);
            startActivityForResult(intent, 1);
        });
    }

    @Override
    public void onClick (View v)
    {
        if (v == BtPlus)
        {
            int Αριθμ1 = Integer.parseInt (EtN1.getText ().toString ());
            int Αριθμ2 = Integer.parseInt (EtN2.getText ().toString ());
            TvRes.setText ("Άθροισμα : " + (Αριθμ1 + Αριθμ2));
        }
    }

    public void ChColor (View V)
    {
        Random Ra = new Random ();
        int color = Color.argb (255, Ra.nextInt (256), Ra.nextInt (256), Ra.nextInt (256));
        ((TextView) V).setTextColor (color);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1)
            if (resultCode == RESULT_OK) {
                String query = data.getStringExtra("query");
                TvRes.setText(query);
            }
    }
}

class BTMinHand implements View.OnClickListener {
    Act1 ref;

    public BTMinHand(Act1 p) {
        ref = p;
    }

    @Override
    public void onClick(View v) {
        int Num1 = Integer.parseInt (ref.EtN1.getText ().toString ());
        int Num2 = Integer.parseInt (ref.EtN2.getText ().toString ());
        ref.TvRes.setText ("Διαφορά : " + (Num1 - Num2));
    }
}
