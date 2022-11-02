package com.if1b.utspab1_rifqi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] tipejalurdaftar = { "Tes Tertulis", "Jalur Tanpa Tes", "Ujian Saringan Masuk"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinaja = findViewById(R.id.sp_jalurdaftar);
        spinaja.setOnItemSelectedListener(this);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item,tipejalurdaftar);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinaja.setAdapter(ad);
    }
    @Override
    public void OnItemSelectedListener(AdapterView<*> arg0, View arg1, int position, long id)
    {
        Toast.makeText(getApplicationContext(),tipejalurdaftar[position], Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<*> arg0)
    {
        // Auto-generated method stub
    }
}