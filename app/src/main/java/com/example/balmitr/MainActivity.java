package com.example.balmitr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mulakshare,anklipi,prani,phule,phale,pakshi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulakshare = (TextView) findViewById(R.id.mulakshare);
        anklipi = (TextView) findViewById(R.id.anklipi);
        prani = (TextView) findViewById(R.id.animals);
        phule = (TextView) findViewById(R.id.flower);
        phale = (TextView) findViewById(R.id.fruit);
        pakshi = (TextView) findViewById(R.id.birds);

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

        phule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Phule.class));
            }
        });

        phale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,phale.class));
            }
        });

        pakshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,pakshi.class));
            }
        });
    }
}