package com.example.drill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView countriesList = findViewById(R.id.countriesList);
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                switch (position){
                    case 0:
                        Intent intent_GPU = new Intent(getApplicationContext(), Graphicscards.class);
                        startActivity(intent_GPU);
                        break;
                    case 1:
                        Intent intent_CPU = new Intent(getApplicationContext(), Processor.class);
                        startActivity(intent_CPU);
                        break;
                    case 2:
                        Intent intent_RAM = new Intent(getApplicationContext(), RAM.class);
                        startActivity(intent_RAM);
                        break;
                }
            }
        });
    }
}