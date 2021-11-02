package com.example.lab1calgritsakovichandreygr393;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ta;
    EditText tb;
    EditText tr;
    EditText td;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ta=findViewById(R.id.editA);
        tb=findViewById(R.id.editB);
        tr=findViewById(R.id.editR);
        td=findViewById(R.id.editD);
    }
    public void onClickFragment(View v)
    {
        double a= 0;
        double b= 0;
        try {
            String sa=ta.getText().toString();
            String sb=tb.getText().toString();

            a = Double.parseDouble(sa);
            b = Double.parseDouble(sb);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


        switch (v.getId())
        {
            case R.id.add:double c=a+b;String sc=String.valueOf(c);
                tr.setText(sc);break;
            case  R.id.vichitanie:c=a-b; sc=String.valueOf(c);
                tr.setText(sc);break;
            case  R.id.ymnojenie:c=a*b; sc=String.valueOf(c);
                tr.setText(sc);break;
            case  R.id.deleni:c=a/b; sc=String.valueOf(c);
                tr.setText(sc);break;
            case  R.id.stepen:c=Math.pow(a,b); sc=String.valueOf(c);
                tr.setText(sc);break;
        }

    }
    public void onClickFragment2(View v)
    {
        String sd= null;
        double d= 0;
        try {
            sd = td.getText().toString();
            d = Double.parseDouble(sd);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        switch (v.getId())
        {
               case R.id.sin2:d=Math.sin(d);sd=String.valueOf(d);
            td.setText(sd);break;
             case R.id.cos:d=Math.cos(d);sd=String.valueOf(d);
                 td.setText(sd);break;
            case  R.id.tg:d=Math.tan(d);sd=String.valueOf(d);
                 td.setText(sd);break;
            case R.id.koren:d=Math.sqrt(d);sd=String.valueOf(d);
                td.setText(sd);break;
            case  R.id.log:d=Math.log(d);sd=String.valueOf(d);
               td.setText(sd);break;
        }

    {
}}}