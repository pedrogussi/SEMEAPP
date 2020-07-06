package com.example.nemaacmk3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mk4 extends Activity {
    double[] numerosTabelados= {2,
                    1.71,
                    1.55,
                    1.5,
                    1.33,
                    1.28,
                    1.16,
                    1.14,
                    1,
                    0.87,
                    0.85,
                    0.77,
                    0.75,
                    0.66,
                    0.64,
                    0.58,
                    0.5};
    String[] respostas =
            {" Engrenagens combináveis A=14 E B=28",
            " Engrenagens combináveis A=14 E B=24",
            " Engrenagens combináveis A=18 E B=28",
            " Engrenagens combináveis A=14 E B=21",
            " Engrenagens combináveis A=21 E B=28",
            " Engrenagens combináveis A=14 E B=18",
            " Engrenagens combináveis A=24 E B=28",
            " Engrenagens combináveis A=21 E B=24",
            " Engrenagens combináveis A=21 E B=21",
            " Engrenagens combináveis A=24 E B=21",
            " Engrenagens combináveis A=21 E B=18",
            " Engrenagens combináveis A=18 E B=14",
            " Engrenagens combináveis A=24 E B=18",
            " Engrenagens combináveis A=21 E B=14",
            " Engrenagens combináveis A=28 E B=18",
            " Engrenagens combináveis A=24 E B=14",
            " Engrenagens combináveis A=28 E B=14"};

    private EditText eesText;
    private EditText crText;
    private EditText nfText;
    private TextView resultText;
    private Button botaoCalcular;
    private double result = 0;
    int aux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mk4);
        eesText = (EditText) findViewById(R.id.eesTextPg);
        crText = (EditText) findViewById(R.id.crTextPg);
        nfText = (EditText) findViewById(R.id.nfTextPg);
        resultText = (TextView) findViewById(R.id.telaDeResultado);

    }
    public void clicaBotao(View view) {
        botaoCalcular = (Button) findViewById(R.id.botaoCalcularPg);
        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
                verificar();
                escrever();
            }
        });

    }

   public void calcular() {
        double ees = Double.parseDouble(eesText.getText().toString());
        double cr = Double.parseDouble(crText.getText().toString());
        double nf = Double.parseDouble(nfText.getText().toString());
        result = (ees) / ((2 * cr * 3.14 / nf) * (4));
       // resultText.setText(""+result);
    }
   public void verificar(){
        double comparacao;
        double cofre = 2;
        for (int i =0;i<=16;i++){
            comparacao = (result - numerosTabelados[i]);
            if (comparacao < 0){
                comparacao=comparacao*(-1);
            }
            if (comparacao<cofre){
                cofre=comparacao;
                aux=i;
            }
        }
        //resultText.setText(Integer.toString(aux));
    }
    public void escrever(){
        resultText.setText(""+respostas[aux]);
    }
}
