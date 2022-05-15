package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Intent ini = new Intent(this,MainActivity.class);
        TextView email =(TextView) findViewById(R.id.username2);
        TextView clave =(TextView) findViewById(R.id.username);

        Button registro = (Button) findViewById(R.id.loginbtn);

        Intent nuevocliente = new Intent(this,RegistrarAnciano.class);

        Clientes cliente = new Clientes();


        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cliente.setCorreo(email.getText().toString());
                cliente.setClave(clave.getText().toString());

                Global.clientes.add(cliente);

                Toast.makeText(Registro.this,"Cliente Registrado",Toast.LENGTH_SHORT).show();

                startActivity(ini);

            }
        });
    }
}