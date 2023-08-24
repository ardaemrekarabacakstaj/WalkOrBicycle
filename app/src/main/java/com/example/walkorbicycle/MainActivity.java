package com.example.walkorbicycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mesafe;
    RadioButton bisiklet,yurume;
    Button btnHesapla;
    TextView txtSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesafe = findViewById(R.id.editTextTextPersonName);
        bisiklet = findViewById(R.id.radioButton);
        yurume = findViewById(R.id.radioButton2);
        btnHesapla = findViewById(R.id.button);
        txtSonuc = findViewById(R.id.textView2);

        btnHesapla.setOnClickListener(v -> {
            hesapla();
        });
    }

    private void hesapla() {
        if(bisiklet.isChecked()){
            String katEdilenMesafe = mesafe.getText().toString();
            Double mesafe = Double.parseDouble(katEdilenMesafe);

            Double kilometers = mesafe/1000;
            txtSonuc.setText("SONUÇ : "+String.valueOf(kilometers) + "KM");
        }
        if(yurume.isChecked()){
            String katEdilenMesafe = mesafe.getText().toString();
            Double mesafe = Double.parseDouble(katEdilenMesafe);
            Double walkingFactor = 0.75;
            Double walkDistance = walkingFactor * mesafe;


            Double kilometers = walkDistance/1000;
            txtSonuc.setText("SONUÇ : "+String.valueOf(kilometers) +" " +"KM");
        }
    }
}