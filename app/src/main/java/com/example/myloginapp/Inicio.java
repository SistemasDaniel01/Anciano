package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Intent historia = new Intent(this,historiaClinica.class);

        MaterialButton historiabtn = (MaterialButton) findViewById(R.id.historia);
        TextView cliente =(TextView) findViewById(R.id.textView6);

        cliente.setText("Hola "+Global.medicos.get(Global.variablej).getNombre());
        historiabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //correct

                startActivity(historia);

            }
        });
    }
}