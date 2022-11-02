package com.if1b.utspab1_rifqi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    TextView tvNama, tvNmrDaftar, tvJalurDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama = findViewById(R.id.tv_konfir_nama);
        tvNmrDaftar = findViewById(R.id.tv_konfir_nmrdaftar);
        tvJalurDaftar = findViewById(R.id.tv_konfir_jalurdaftar);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        String yNmrDaftar = terima.getStringExtra("xNmrDaftar");
        String yJalurDaftar = terima.getStringExtra("xJalurDaftar");

        tvNama.setText(yNama);
        tvNmrDaftar.setText(yNmrDaftar);
        tvJalurDaftar.setText(yJalurDaftar);

    }
}