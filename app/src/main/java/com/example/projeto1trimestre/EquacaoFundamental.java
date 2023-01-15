package com.example.projeto1trimestre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EquacaoFundamental extends AppCompatActivity {

    private EditText frequencia;
    private EditText comprimento;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equacao_fundamental);
        frequencia = findViewById(R.id.txtFrequencia);
        comprimento = findViewById(R.id.txtComp);
        resultado = findViewById(R.id.txtResult);
    }

    public void buttonCalc(View view) {
        String frequencia = this.frequencia.getText().toString();
        String comprimento = this.comprimento.getText().toString();
        Float freq = Float.parseFloat(frequencia);
        Float comp = Float.parseFloat(comprimento);

        Float v = comp*freq;

        this.resultado.setText(v + " m/s");
    }
}
