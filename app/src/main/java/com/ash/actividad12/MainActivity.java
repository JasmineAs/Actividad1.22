package com.ash.actividad12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
    }



    public void EnviarDatos(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra( "dato",name.getText().toString());
        startActivity(i);
    }


}
