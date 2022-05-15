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


    private static boolean bandera = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Clientes client = new Clientes();
        client.setCorreo("Mario");
        client.setClave("456");
        Global.clientes.add(client);
        ListElement anciano1 = new ListElement();
        anciano1.setColor("#770077");
        anciano1.setName("Oscar Rodríguez");
        anciano1.setCity("Bogotá");
        anciano1.setStatus("Diabetes");
        anciano1.setEdad(70);
        anciano1.setSexo("Masculino");
        anciano1.setDiagnostico("Diabetes controlada, mejorar ejercicio");
        anciano1.setPosologia("Debe caminar 3 veces al día durante 20 minutos, tomar medicamentoY cada 6 horas");
        Global.elements.add(anciano1);
        ListElement anciano2 = new ListElement();
        anciano2.setColor("#885543");
        anciano2.setName("Antonia Florez");
        anciano2.setCity("Ibagué");
        anciano2.setStatus("Ninguna");
        anciano2.setEdad(67);
        anciano2.setSexo("Femenino");
        anciano2.setDiagnostico("Posibles afectaciones en el corazón a futuro");
        anciano2.setPosologia("Revisar su tensión 2 veces al dia, reportar cambios");
        Global.elements.add(anciano2);
        ListElement anciano3 = new ListElement();
        anciano3.setColor("#124388");
        anciano3.setName("Juan Principado");
        anciano3.setCity("Bogotá");
        anciano3.setStatus("Tensión Alta");
        anciano3.setEdad(89);
        anciano3.setSexo("Masculino");
        anciano3.setDiagnostico("Su tensión es controlada pero posee leves alteraciones en la misma");
        anciano3.setPosologia("Tomar medicamentoW en ayunas");
        Global.elements.add(anciano3);
        ListElement anciano4 = new ListElement();
        anciano4.setColor("#008755");
        anciano4.setName("Lola Jazmin");
        anciano4.setCity("Bogotá");
        anciano4.setStatus("Demensia leve");
        anciano4.setEdad(98);
        anciano4.setSexo("Femenino");
        anciano4.setDiagnostico("Tiene problemas al recordar ciertos sucesos cercanos y presenta indicios de TOC");
        anciano4.setPosologia("Sesiones donde se hable con ella todos los días al menos durante 1 hora, tomar medicamentoR para controlar rasgos agresivos");
        Global.elements.add(anciano4);


        Intent siguiente = new Intent(this,Inicio.class);
        Intent registro = new Intent(this,Registro.class);
        Intent cliente = new Intent(this,Cliente.class);


        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        MaterialButton registerbtn = (MaterialButton) findViewById(R.id.registerbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<Global.clientes.size();i++){

                    if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                        //correct
                        bandera = false;

                        startActivity(siguiente);

                        Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    }else if(username.getText().toString().equals(Global.clientes.get(i).getCorreo()) && password.getText().toString().equals(Global.clientes.get(i).getClave())){

                        bandera = false;
                        Global.variablei = i;
                        startActivity(cliente);
                    }
                }

                if(bandera){
                    Toast.makeText(MainActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
                }


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