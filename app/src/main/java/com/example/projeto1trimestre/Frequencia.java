package com.example.projeto1trimestre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Frequencia extends AppCompatActivity {

    private EditText periodo;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequencia);
        periodo = findViewById(R.id.txPeriodo);
        resultado = findViewById(R.id.txtResult);
    }

    public void buttonCalc(View view) {
        String periodo = this.periodo.getText().toString();
        Float perid = Float.parseFloat(periodo);

        Float f = 1/perid;

        this.resultado.setText(f+" Hz");
    }
}
