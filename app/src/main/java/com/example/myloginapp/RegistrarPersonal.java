package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RegistrarPersonal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_personal);

        Intent registro = new Intent(this,Administrador.class);
        TextView email =(TextView) findViewById(R.id.username2);
        TextView clave =(TextView) findViewById(R.id.username);

        MaterialButton registrobtn = (MaterialButton) findViewById(R.id.loginbtn);

        Medico medico = new Medico();

        registrobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                medico.setNombre(email.getText().toString());
                medico.setClave(clave.getText().toString());

                Global.medicos.add(medico);

                Toast.makeText(RegistrarPersonal.this,"Médico Registrado",Toast.LENGTH_SHORT).show();

                startActivity(registro);

            }
        });
    }
}