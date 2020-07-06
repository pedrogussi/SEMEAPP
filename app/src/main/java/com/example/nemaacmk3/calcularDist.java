package com.example.nemaacmk3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calcularDist extends Activity {
    private EditText capRes;
    private EditText larg;
    private EditText quatAplic;
    private Button somarBtn;
    private TextView respostaDist;
    private double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_dist);
        capRes = (EditText) findViewById(R.id.capRes);
        larg = (EditText) findViewById(R.id.larg);
        quatAplic = (EditText)findViewById(R.id.quatAplic);
        respostaDist = (TextView) findViewById(R.id.respostaDist);


    }
    public void clica1(View view){
        somarBtn = (Button) findViewById(R.id.somarBtn);
        somarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular2();
            }
        });
    }
    public void calcular2(){
        double cR = Double.parseDouble(capRes.getText().toString());
        double lg = Double.parseDouble(larg.getText().toString());
        double qA = Double.parseDouble(quatAplic.getText().toString());
        resultado = ((cR*10000)/(lg*qA));
        respostaDist.setText(""+resultado+"m");


    }
}
