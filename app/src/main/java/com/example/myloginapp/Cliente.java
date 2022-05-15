package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Cliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        MaterialButton register = (MaterialButton) findViewById(R.id.regis);

        Intent registro = new Intent(this,RegistrarAnciano.class);
        TextView cliente =(TextView) findViewById(R.id.textView6);

        cliente.setText("Hola "+Global.clientes.get(Global.variablei).getCorreo());

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //correct

                startActivity(registro);

            }
        });
    }
}