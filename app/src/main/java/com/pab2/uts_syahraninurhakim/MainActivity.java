package com.pab2.uts_syahraninurhakim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText etnama,etnomor;
    private Spinner spjalur;
    private Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("UTS_SyahraniNurHakim");

        btnDaftar = findViewById(R.id.btn_daftar);
        etnnama = findViewById(R.id.et_namalengkap);
        etnomor = findViewById(R.id.et_nomorpendaftaran);
    }
}