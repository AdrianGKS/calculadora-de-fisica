package com.example.projeto1trimestre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Periodo extends AppCompatActivity {

    private EditText frequencia;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodo);
        frequencia = findViewById(R.id.txtFrequencia);
        resultado = findViewById(R.id.txtResult);
    }

    public void buttonCalc(View view) {
        String frequencia = this.frequencia.getText().toString();
        Float freq = Float.parseFloat(frequencia);

        Float p = 1/freq;

        this.resultado.setText(p + " s");
    }
}
