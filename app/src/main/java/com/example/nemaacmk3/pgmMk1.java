package com.example.nemaacmk3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class pgmMk1 extends Activity {
    double[] numerosTabelados2= {1.64,
            1.5,
            1.43,
            1.35,
            1.31,
            1.27,
            1.21,
            1.18,
            1.16,
            1.15,
            1.07,
            1.06,
            1.055,
            1.05,
            0.958,
            0.95,
            0.94,
            0.93,
            0.87,
            0.85,
            0.83,
            0.79,
            0.75,
            0.70,
            0.62};
    String[] respostasPgm2 = {" Engrenagens combináveis A=14 E B=23",
            " Engrenagens combináveis A=14 E B=21",
            " Engrenagens combináveis A=16 E B=23",
            " Engrenagens combináveis A=14 E B=19",
            " Engrenagens combináveis A=16 E B=21",
            " Engrenagens combináveis A=18 E B=23",
            " Engrenagens combináveis A=14 E B=17",
            " Engrenagens combináveis A=16 E B=19",
            " Engrenagens combináveis A=20 E B=23",
            " Engrenagens combináveis A=14 E B=15",
            " Engrenagens combináveis A=16 E B=17",
            " Engrenagens combináveis A=18 E B=19",
            " Engrenagens combináveis A=20 E B=21",
            " Engrenagens combináveis A=24 E B=23",
            " Engrenagens combináveis A=20 E B=19",
            " Engrenagens combináveis A=18 E B=17",
            " Engrenagens combináveis A=16 E B=15",
            " Engrenagens combináveis A=24 E B=21",
            " Engrenagens combináveis A=20 E B=17",
            " Engrenagens combináveis A=18 E B=15",
            " Engrenagens combináveis A=24 E B=19",
            " Engrenagens combináveis A=20 E B=15",
            " Engrenagens combináveis A=24 E B=17",
            " Engrenagens combináveis A=24 E B=15"};


    private EditText eesTextPg;
    private EditText crTextPg;
    private EditText nfTextPg;
    private TextView telaDeResultado;
    private Button botaoCalcularPg;
    private double resultPg = 0;
    int aux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgm_mk1);
        eesTextPg = (EditText) findViewById(R.id.eesTextPg);
        crTextPg = (EditText) findViewById(R.id.crTextPg);
        nfTextPg = (EditText) findViewById(R.id.nfTextPg);
        telaDeResultado = (TextView) findViewById(R.id.telaDeResultado);
    }


    public void clicaBotao(View view) {
        botaoCalcularPg = (Button) findViewById(R.id.botaoCalcularPg);
        botaoCalcularPg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularPg();
                verificarPg();
                escreverPg();


            }
        });

    }

    public void calcularPg() {
        double ees = Double.parseDouble(eesTextPg.getText().toString());
        double cr = Double.parseDouble(crTextPg.getText().toString());
        double nf = Double.parseDouble(nfTextPg.getText().toString());
        resultPg = (ees) / ((2 * cr * 3.14 / nf) * (4));
        //resultText.setText(""+result);


    }

    public void verificarPg() {
        double comparacao1;
        double cofre1 = 1.65;
//cofre sempre como maior resultado do array de numeros tabelados


        for (int i = 0; i <= 23; i++) {
// lengh dos dois arrays 0 vale uma posiçao entao o segundo valor e o numero de itens - 1
            comparacao1 = resultPg - numerosTabelados2[i];
            if (comparacao1 < 0) {
                comparacao1 = comparacao1 * (-1);
            }
            if (comparacao1 < cofre1) {
                cofre1 = comparacao1;
                aux = i;

            }

        }
        // resultText.setText(Integer.toString(aux));
    }

    public void escreverPg() {
        telaDeResultado.setText("" + respostasPgm2[aux]);
    }

}


