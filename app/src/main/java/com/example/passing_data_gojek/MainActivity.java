package com.example.passing_data_gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton v_gomart;
    ImageButton v_goride;
    ImageButton v_gofood;
    ImageButton v_gosend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v_gomart = (ImageButton) findViewById(R.id.gomart);
        v_goride = (ImageButton) findViewById(R.id.goride);
        v_gofood = (ImageButton) findViewById(R.id.gofood);
        v_gosend = (ImageButton) findViewById(R.id.gosend);

        v_gofood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivity.this,gofood.class);
                startActivity(move);
            }
        });

        v_gomart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivity.this,gomart.class);
            }
        });

        v_goride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivity.this,goride.class);
            }
        });

        v_gosend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivity.this,gosend.class);
            }
        });
    }
}
