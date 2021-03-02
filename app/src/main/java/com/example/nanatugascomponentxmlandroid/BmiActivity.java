package com.example.nanatugascomponentxmlandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class BmiActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        EditText bb = findViewById(R.id.berat);
        EditText tinggi = findViewById(R.id.tinggi);
        Button btnBMI = findViewById(R.id.btn_bb);
        TextView hasil = findViewById(R.id.tv_hasil);
        TextView ket = findViewById(R.id.tv_keterangan);

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double BB, Tinggi, Hasil;
                BB = Double.valueOf(bb.getText().toString());
                Tinggi = Double.valueOf(tinggi.getText().toString());

                Hasil = BB / (Tinggi * Tinggi);
                String  HasilBMI = String.valueOf(Hasil);
                hasil.setText(HasilBMI);



                if (Hasil >= 0 && Hasil < 18.5){
                    ket.setText("Kekurangan Berat Badan");
                }
                else if (Hasil >= 18.5 && Hasil <= 24.9){
                    ket.setText("Normal(ideal)");
                }
                else if (Hasil >= 25.0 && Hasil <= 29.9 ){
                    ket.setText("Kelebihan Berat Badan");
                }
                else {
                    ket.setText("Kegemukan(Obesitas)");
                }
            }
        });




    }
}