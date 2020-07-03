package com.example.balmitr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mulakshare,anklipi,prani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulakshare = (TextView) findViewById(R.id.mulakshare);
        anklipi = (TextView) findViewById(R.id.anklipi);
        prani = (TextView) findViewById(R.id.animals);

        mulakshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this ,Mulakshare.class));
            }
        });

        anklipi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Anklipi.class));
            }
        });

        prani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Prani.class));
            }
        });
    }
}