package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Administrador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);

        Intent registro = new Intent(this,RegistrarPersonal.class);
        MaterialButton registrar = (MaterialButton) findViewById(R.id.regismed);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //correct

                startActivity(registro);

            }
        });

    }
}