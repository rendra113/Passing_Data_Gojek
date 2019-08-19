package com.example.passing_data_gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class order_page extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        final Button cancel = (Button) findViewById(R.id.cancel);
        final TextView text1 = (TextView) findViewById(R.id.id_nama);
        final TextView text2 = (TextView) findViewById(R.id.id_pesanan);
        final TextView text3 = (TextView) findViewById(R.id.id_alamat);


        String nama = getIntent().getStringExtra("EXTRA_NAMA");
        text1.setText(nama);

        String pesanan = getIntent().getStringExtra("EXTRA_PESANAN");
        text2.setText(pesanan);

        String alamat = getIntent().getStringExtra("EXTRA_ALAMAT");
        text3.setText(alamat);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}

