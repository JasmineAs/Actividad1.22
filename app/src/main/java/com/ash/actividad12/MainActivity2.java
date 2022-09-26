package com.ash.actividad12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv2 = (TextView) findViewById(R.id.TV2);

        String dato = getIntent().getStringExtra("dato");
        tv2.setText("Hola " +  dato);

    }


    public void Regresar (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }


}