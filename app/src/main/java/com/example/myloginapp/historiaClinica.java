package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class historiaClinica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_clinica);
        init();

        

    }

    public void init(){



        ListAdapter listAdapter = new ListAdapter(Global.elements, this, new ListAdapter.OnItemClickListener() {
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