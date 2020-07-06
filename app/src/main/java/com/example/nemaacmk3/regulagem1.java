package com.example.nemaacmk3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class regulagem1 extends Activity {
    CardView cardPcr;
    CardView cardPmg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulagem1);
        cardPcr = (CardView)findViewById(R.id.cardPcr);
        cardPcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(regulagem1.this, mk4.class);
                startActivity(intent);
            }
        });
        cardPmg = (CardView)findViewById(R.id.cardPmg);
        cardPmg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(regulagem1.this,pgmMk1.class);
                startActivity(intent);
            }
        });



    }
}
