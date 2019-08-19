package com.example.passing_data_gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class gofood extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);


        Button order = (Button) findViewById(R.id.btn_order);



        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(getBaseContext(),order_page.class);

                EditText v_nama = (EditText) findViewById(R.id.et_nama);
                final String text_nama = v_nama.getText().toString();
                EditText v_pesanan = (EditText) findViewById(R.id.et_pesan);
                final String pesanan = v_pesanan.getText().toString();
                EditText v_alamat = (EditText) findViewById(R.id.et_alamat);
                final String alamat = v_alamat.getText().toString();


                pindah.putExtra("EXTRA_NAMA",text_nama);
                pindah.putExtra("EXTRA_PESANAN",pesanan);
                pindah.putExtra("EXTRA_ALAMAT",alamat);

                startActivity(pindah);

            }
        });
    }
}
