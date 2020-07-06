package com.example.nemaacmk3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class marcadoresLinhas extends Activity {
    private EditText nLinhasText;
    private EditText bitolaText;
    private EditText espacamentoLinhas;
    private Button calcularBtn;
    private TextView respostaText;
    private double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcadores_linhas);
        nLinhasText = (EditText) findViewById(R.id.nLinhasText2);
        bitolaText = (EditText) findViewById(R.id.bitolaText);
        espacamentoLinhas = (EditText) findViewById(R.id.espacamentoLinhas);
        respostaText = (TextView) findViewById(R.id.respostaText);

    }

    public void clica(View view) {
        calcularBtn = (Button) findViewById(R.id.calcularBtn);
        calcularBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();

            }
        });
    }

    public void calcular() {
        double nL = Double.parseDouble(nLinhasText.getText().toString());
        double bi = Double.parseDouble(bitolaText.getText().toString());
        double espac = Double.parseDouble(espacamentoLinhas.getText().toString());
        resultado = (espac * (nL + 1) - bi) / 2;
        respostaText.setText("" + resultado +"m");
    }
}
