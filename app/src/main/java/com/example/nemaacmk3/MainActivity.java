package com.example.nemaacmk3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView botaoRegulagem;
    private CardView botaoCalculadora;
    private CardView dicasId;
    private CardView marcLinhas;
    private CardView calcDist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoRegulagem = (CardView) findViewById(R.id.botaoRegulagem);
        botaoRegulagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, regulagem1.class);
                startActivity(intent);
            }
        });
        botaoCalculadora = (CardView) findViewById(R.id.botaoCalculadora);
        botaoCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, calcular1.class);
                startActivity(intent);
            }
        });
        dicasId = (CardView) findViewById(R.id.dicasId);
        dicasId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dicas1.class);
                startActivity(intent);
            }
        });
        marcLinhas = (CardView) findViewById(R.id.marcLinhas);
        marcLinhas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, marcadoresLinhas.class);
                startActivity(intent);


            }

        });
        calcDist = (CardView) findViewById(R.id.calcDist);
        calcDist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, calcularDist.class);
                startActivity(intent);
            }
        });
    }
}