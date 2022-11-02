package com.if1b.utspab1_rifqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] tipejalurdaftar = { "Tes Tertulis", "Jalur Tanpa Tes", "Ujian Saringan Masuk"}, nomorDaftar, nama;
    EditText etNmrDaftar, etNama;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Layout A");
        btnDaftar = findViewById(R.id.btn_daftar);
        etNama = findViewById(R.id.et_nama);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                if (nama.trim().equals("")){
                    etNama.setError("Nama Harus Diisi!");
            } else {
                    Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                    pindah.putExtra("xNama", nama);
                    startActivity(pindah);
                }
            }
        });
        Spinner spinaja = findViewById(R.id.sp_jalurdaftar);
        spinaja.setOnItemSelectedListener(this);

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,tipejalurdaftar);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinaja.setAdapter(ad);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id){
        Toast.makeText(getApplicationContext(),tipejalurdaftar[position], Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0){
        // Auto-generated method stub
    }
    }
