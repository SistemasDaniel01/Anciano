package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.List;

public class RegistrarAnciano extends AppCompatActivity {

    ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_anciano);
        Intent histori = new Intent(this,Inicio.class);

        TextView name =(TextView) findViewById(R.id.name);
        TextView surname =(TextView) findViewById(R.id.surname);
        TextView gender =(TextView) findViewById(R.id.gender);
        TextView Age =(TextView) findViewById(R.id.Age);
        TextView document =(TextView) findViewById(R.id.document);
        TextView address =(TextView) findViewById(R.id.address);
        TextView illness =(TextView) findViewById(R.id.illness);

        Intent registrar = new Intent(this,Registro.class);


        MaterialButton registrarAnci = (MaterialButton) findViewById(R.id.registrarAnciano);

        registrarAnci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ListElement anciano = new ListElement();
                anciano.setColor("#770077");
                anciano.setName(name.getText().toString() + " "+surname.getText().toString());
                anciano.setSexo(gender.getText().toString());
                anciano.setEdad(Integer.parseInt(Age.getText().toString()));
                anciano.setDocumento(document.getText().toString());
                anciano.setDireccion(address.getText().toString());
                anciano.setStatus(illness.getText().toString());
                anciano.setCity("Bogota");
                anciano.setDiagnostico("Diabetes controlada, mejorar ejercicio");
                anciano.setPosologia("Debe caminar 3 veces al dia durante 20 minutos, tomar medicamentoY cada 6 horas");
                Global.elements.add(anciano);
                Toast.makeText(RegistrarAnciano.this,"Registro Exitoso",Toast.LENGTH_SHORT).show();

                //startActivity(histori);


            }
        });
    }
}