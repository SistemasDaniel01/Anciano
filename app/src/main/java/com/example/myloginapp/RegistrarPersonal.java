package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class RegistrarPersonal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_personal);

        Intent registro = new Intent(this,RegistrarPersonal.class);

        MaterialButton registrobtn = (MaterialButton) findViewById(R.id.loginbtn);

        registrobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //correct

            }
        });
    }
}