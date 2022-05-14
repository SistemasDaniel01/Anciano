package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    TextView titleDescriptionTextView;
    TextView edadDescriptionTextView;
    TextView statusDescriptionTextView;
    TextView sexoDescriptionTextView;
    TextView diagDescriptionTextView;
    TextView posoDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        ListElement element = (ListElement) getIntent().getSerializableExtra("ListElement");
        titleDescriptionTextView = findViewById(R.id.titleDescriptionTextView);
        edadDescriptionTextView = findViewById(R.id.edadDescriptionTextView);
        statusDescriptionTextView = findViewById(R.id.enferDescriptionTextView);
        sexoDescriptionTextView = findViewById(R.id.sexoDescriptionTextView);
        diagDescriptionTextView = findViewById(R.id.diagDescriptionTextView);
        posoDescriptionTextView = findViewById(R.id.posoDescriptionTextView);

        titleDescriptionTextView.setText(element.getName());
        titleDescriptionTextView.setTextColor(Color.parseColor(element.getColor()));
        edadDescriptionTextView.setText(element.getEdad()+"");
        statusDescriptionTextView.setText(element.getStatus());
        sexoDescriptionTextView.setText(element.getSexo());
        diagDescriptionTextView.setText(element.getDiagnostico());
        posoDescriptionTextView.setText(element.getPosologia());

    }
}