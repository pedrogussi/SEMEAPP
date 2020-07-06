package com.example.nemaacmk3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calcular1 extends Activity {
    private Button calcPotBtn1;
    private EditText velocText;
    private EditText nLinhasText;
    private TextView potenciaResp1;
    private double potencia1;

    private TextView dadosText;
    private TextView dicaText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular1);
        velocText = (EditText) findViewById(R.id.velocText);
        nLinhasText = (EditText) findViewById(R.id.nLinhasText);
        potenciaResp1 = (TextView) findViewById(R.id.potenciaResp1);

    }
    public void clicpot1(View view){
        calcPotBtn1 = (Button) findViewById(R.id.calcPotBtn1);
        calcPotBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calco1();
            }
        });
    }
    public  void calco1(){
        double v1 = Double.parseDouble(velocText.getText().toString());
        double nl1 = Double.parseDouble(nLinhasText.getText().toString());
        potencia1 = (int)(((2.68*v1*nl1)/3.6)/0.736);
        potenciaResp1.setText("" + potencia1 +"cv");
    }
}