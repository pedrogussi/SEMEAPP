package com.example.nemaacmk3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
        import android.os.Bundle;
        import android.widget.TextView;

public class dicas1 extends Activity {
    public TextView textDicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas1);
        textDicas = (TextView)findViewById(R.id.textDicas);

    }
}
