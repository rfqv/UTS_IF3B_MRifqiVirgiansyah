package com.if1b.utspab1_rifqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etNmrDaftar;
    Spinner spJalurDaftar;
    CheckBox konfircentang;
    Button btnDaftar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = findViewById(R.id.et_nama);
        etNmrDaftar = findViewById(R.id.et_nmrdaftar);
        spJalurDaftar = findViewById(R.id.sp_jalurdaftar);
        konfircentang = findViewById(R.id.cb_konfirdaftar);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaFix = etNama.getText().toString();
                String nmrFix = etNmrDaftar.getText().toString();
                String jalurFix = (String) spJalurDaftar.getSelectedItem();
                if (namaFix.equals("")) {
                    etNama.setError("Nama Harus Diisi!");
                } else if (nmrFix.equals("")) {
                    etNmrDaftar.setError("Nomor Pendaftaran Harus Diisi!");
                } else if (!konfircentang.isChecked()) {
                    Toast.makeText(MainActivity.this, "Harap mencentang CheckBox berikut!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                    pindah.putExtra("xNama", namaFix);
                    pindah.putExtra("xNmrDaftar", nmrFix);
                    pindah.putExtra("JalurDaftar", jalurFix);
                    startActivity(pindah);
                }
            }
        });
    }
}
