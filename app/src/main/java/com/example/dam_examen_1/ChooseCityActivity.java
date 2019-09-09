package com.example.dam_examen_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class ChooseCityActivity extends AppCompatActivity {
    private ListView listView;

    private String countries [] = {"Pakistán", "Palaos", "Panamá", "Paraguay", "Perú", "Polonia",
            "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_city);

        //listView = findViewById(R.id.listView);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_countries, countries);
        //listView.setAdapter(adapter);
    }

}
