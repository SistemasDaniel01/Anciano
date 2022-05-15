package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListElement anciano1 = new ListElement();
        anciano1.setColor("#770077");
        anciano1.setName("Oscar Rodriguez");
        anciano1.setCity("Bogota");
        anciano1.setStatus("Diabetes");
        anciano1.setEdad(70);
        anciano1.setSexo("Masculino");
        anciano1.setDiagnostico("Diabetes controlada, mejorar ejercicio");
        anciano1.setPosologia("Debe caminar 3 veces al dia durante 20 minutos, tomar medicamentoY cada 6 horas");
        Global.elements.add(anciano1);
        ListElement anciano2 = new ListElement();
        anciano2.setColor("#885543");
        anciano2.setName("Antonia Florez");
        anciano2.setCity("Ibague");
        anciano2.setStatus("Ninguna");
        anciano2.setEdad(67);
        anciano2.setSexo("Femenino");
        anciano2.setDiagnostico("Posibles afectaciones en el corazon a futuro");
        anciano2.setPosologia("Revisar su tension 2 veces al dia, reportar cambios");
        Global.elements.add(anciano2);
        ListElement anciano3 = new ListElement();
        anciano3.setColor("#124388");
        anciano3.setName("Juan Principado");
        anciano3.setCity("Bogota");
        anciano3.setStatus("Tension Alta");
        anciano3.setEdad(89);
        anciano3.setSexo("Masculino");
        anciano3.setDiagnostico("su tension es controlada pero posee leves alteraciones en la misma");
        anciano3.setPosologia("tomar medicamentoW en ayunas");
        Global.elements.add(anciano3);
        ListElement anciano4 = new ListElement();
        anciano4.setColor("#008755");
        anciano4.setName("Lola Jazmin");
        anciano4.setCity("Bogota");
        anciano4.setStatus("Demensia leve");
        anciano4.setEdad(98);
        anciano4.setSexo("Femenino");
        anciano4.setDiagnostico("tiene problemas al recordar ciertos sucesos cercanos y presenta indicios de TOC");
        anciano4.setPosologia("sesiones donde se hable con ella todos los dias al menos durante 1 hora, tomar medicamentoR para controlar rasgos agresivos");
        Global.elements.add(anciano4);


        Intent siguiente = new Intent(this,Inicio.class);
        Intent registro = new Intent(this,Registro.class);
        Intent cliente = new Intent(this,Cliente.class);
        Intent admin = new Intent(this, Administrador.class);


        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        MaterialButton registerbtn = (MaterialButton) findViewById(R.id.registerbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("medico") && password.getText().toString().equals("medico")){
                    //correct

                    startActivity(siguiente);

                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else if(username.getText().toString().equals("cliente") && password.getText().toString().equals("cliente")){

                    startActivity(cliente);
                }else if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){

                    startActivity(admin);
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //correct

                startActivity(registro);

            }
        });


    }
}