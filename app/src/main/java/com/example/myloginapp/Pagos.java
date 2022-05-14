package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Pagos extends AppCompatActivity {

    private Spinner spi1;
    private Spinner spi2;

    MaterialButton pagar = (MaterialButton) findViewById(R.id.pagar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagos);

        spi1 = (Spinner) findViewById(R.id.spi1);
        spi2 = (Spinner) findViewById(R.id.spi2);

        String[] opciones = {"Plan Pro","Plan Premium"};

        String[] pagos = {"PSE","Credito","Efectivo"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opciones);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,pagos);
        spi1.setAdapter(adapter);
        spi2.setAdapter(adapter1);

        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String plan = spi1.getSelectedItem().toString();
               String pay = spi2.getSelectedItem().toString();

               String total = "Usted selecciono el plan: "+plan+" y el metodo de pago: "+pay;

                Toast.makeText(Pagos.this,total,Toast.LENGTH_SHORT).show();


            }
        });


    }



}