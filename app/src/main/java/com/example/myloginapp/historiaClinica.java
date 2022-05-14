package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class historiaClinica extends AppCompatActivity {
    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_clinica);
        init();

    }

    public void init(){
        elements = new ArrayList<>();
        ListElement anciano1 = new ListElement();
        anciano1.setColor("#770077");
        anciano1.setName("Oscar Rodriguez");
        anciano1.setCity("Bogota");
        anciano1.setStatus("Diabetes");
        anciano1.setEdad(70);
        anciano1.setSexo("Masculino");
        anciano1.setDiagnostico("Diabetes controlada, mejorar ejercicio");
        anciano1.setPosologia("Debe caminar 3 veces al dia durante 20 minutos, tomar medicamentoY cada 6 horas");
        elements.add(anciano1);
        ListElement anciano2 = new ListElement();
        anciano2.setColor("#885543");
        anciano2.setName("Antonia Florez");
        anciano2.setCity("Ibague");
        anciano2.setStatus("Ninguna");
        anciano2.setEdad(67);
        anciano2.setSexo("Femenino");
        anciano2.setDiagnostico("Posibles afectaciones en el corazon a futuro");
        anciano2.setPosologia("Revisar su tension 2 veces al dia, reportar cambios");
        elements.add(anciano2);
        ListElement anciano3 = new ListElement();
        anciano3.setColor("#124388");
        anciano3.setName("Juan Principado");
        anciano3.setCity("Bogota");
        anciano3.setStatus("Tension Alta");
        anciano3.setEdad(89);
        anciano3.setSexo("Masculino");
        anciano3.setDiagnostico("su tension es controlada pero posee leves alteraciones en la misma");
        anciano3.setPosologia("tomar medicamentoW en ayunas");
        elements.add(anciano3);
        ListElement anciano4 = new ListElement();
        anciano4.setColor("#008755");
        anciano4.setName("Lola Jazmin");
        anciano4.setCity("Bogota");
        anciano4.setStatus("Demensia leve");
        anciano4.setEdad(98);
        anciano4.setSexo("Femenino");
        anciano4.setDiagnostico("tiene problemas al recordar ciertos sucesos cercanos y presenta indicios de TOC");
        anciano4.setPosologia("sesiones donde se hable con ella todos los dias al menos durante 1 hora, tomar medicamentoR para controlar rasgos agresivos");
        elements.add(anciano4);



        ListAdapter listAdapter = new ListAdapter(elements, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(ListElement item) {
                moveToDescription(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

    public void moveToDescription(ListElement item){
        Intent intent = new Intent(this,DescriptionActivity.class);
        intent.putExtra("ListElement",item);
        startActivity(intent);
    }
}