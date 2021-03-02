package com.example.nanatugascomponentxmlandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SuhuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        Spinner pilihan1 = findViewById(R.id.suhuAsal);
        Spinner pilihan2 = findViewById(R.id.suhuTujuan);
        EditText inputSuhu = findViewById(R.id.input_suhu);
        TextView txtHasil = findViewById(R.id.tv_hasil2);
        Button btnSuhu = findViewById(R.id.btn_suhu);

        btnSuhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String suhuAwal = pilihan1.getSelectedItem().toString();
                String suhuAkhir = pilihan2.getSelectedItem().toString();

                if (inputSuhu.getText().toString().equals("")){
                    Toast.makeText(SuhuActivity.this, "Nillai Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }else {
                    if (suhuAwal.equals("Fahrenreit") && suhuAkhir.equals("Celcius")){
                        double  suhu;
                         suhu = Double.parseDouble(inputSuhu.getText().toString());
                         double akhir = (suhu - 32) / 1.8;
                         txtHasil.setText(akhir +"");
                    }
                    else if (suhuAwal.equals("Fahrenreit") && suhuAkhir.equals("Kelvin")){
                        double  suhu;
                        suhu = Double.parseDouble(inputSuhu.getText().toString());
                        double akhir = (suhu - 32) * 0.55 + 273.15;
                        txtHasil.setText(akhir +"");
                    }
                    else if (suhuAwal.equals("Celcius") && suhuAkhir.equals("Fahrenreit")){
                        double  suhu;
                        suhu = Double.parseDouble(inputSuhu.getText().toString());
                        double akhir = (suhu * 1.8) + 32;
                        txtHasil.setText(akhir +"");
                    }
                    else if (suhuAwal.equals("Celcius") && suhuAkhir.equals("Kelvin")){
                        double  suhu;
                        suhu = Double.parseDouble(inputSuhu.getText().toString());
                        double akhir = suhu + 273.15;
                        txtHasil.setText(akhir +"");
                    }
                    else if (suhuAwal.equals("Kelvin") && suhuAkhir.equals("Fahrenreit")){
                        double  suhu;
                        suhu = Double.parseDouble(inputSuhu.getText().toString());
                        double akhir = (suhu - 273.15) * 1.8 + 32;
                        txtHasil.setText(akhir +"");
                    }
                    else if (suhuAwal.equals("Kelvin") && suhuAkhir.equals("Celcius")){
                        double  suhu;
                        suhu = Double.parseDouble(inputSuhu.getText().toString());
                        double akhir = suhu - 273.15;
                        txtHasil.setText(akhir +"");
                    }

                }
            }
        });

    }


}