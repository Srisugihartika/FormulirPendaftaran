package com.ssugihartika.punya_atik.uaspertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edNama, edNohp, edAlamat;
    Spinner spinnerPilihan;
    TextView tvHasil;
    Button btnDaftar;
    String[] pilihDaftar = {"Mobile", "Web", "Desktop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.ed_nama);
        edNohp = findViewById(R.id.ed_nohp);
        edAlamat = findViewById(R.id.ed_alamat);
        tvHasil = findViewById(R.id.tv_hasil);
        btnDaftar = findViewById(R.id.btn_daftar);
        spinnerPilihan = findViewById(R.id.spinner_pilihan);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (spinnerPilihan.getSelectedItem().toString().equals(pilihDaftar[0])){
                    String hasil = "Syarat Bawa Smartphone" ;
                    tvHasil.setText(hasil.toString());
                } else if (spinnerPilihan.getSelectedItem().toString().equals(pilihDaftar[1])) {
                    String hasil = "Syarat Bawa Laptop & Xampp" ;
                    tvHasil.setText(hasil.toString());
                 }else if (spinnerPilihan.getSelectedItem().toString().equals(pilihDaftar[2])) {
                    String hasil = "Syarat Bawa Laptop plus ada Netbean";
                    tvHasil.setText(hasil.toString());
                }
             }
            });

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, pilihDaftar);
        spinnerPilihan.setAdapter(adapter);

    }


}
