package com.example.drill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Graphicscards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphicscards);

        ArrayList<GPU> cards = new ArrayList<GPU>();

        cards.add(new GPU("RTX 4070", "NVIDIA GeForce RTX 4070, объем видеопамяти: 12 ГБ, разработчик видеокарты: NVIDIA, линейка: GeForce, тип памяти: GDDR6, разрядность шины памяти: 256 бит, игровая, Версия PCI Express: 4.0, Количество выходов HDMI: 1, Выход DisplayPort, поддержка трассировки лучей."));
        cards.add(new GPU("RTX 4080", "NVIDIA GeForce RTX 4080, объем видеопамяти: 24 ГБ, разработчик видеокарты: NVIDIA, линейка: GeForce, тип памяти: GDDR6X, разрядность шины памяти: 320 бит, игровая, Версия PCI Express: 4.0, Количество выходов HDMI: 1, Выход DisplayPort, поддержка трассировки лучей."));
        cards.add(new GPU("RTX 4090", "NVIDIA GeForce RTX 4090, объем видеопамяти: 32 ГБ, разработчик видеокарты: NVIDIA, линейка: GeForce, тип памяти: GDDR6X, разрядность шины памяти: 384 бит, игровая, Версия PCI Express: 4.0, Количество выходов HDMI: 1, Выход DisplayPort, поддержка трассировки лучей."));

        ListView countriesList = findViewById(R.id.countriesList);

        ArrayAdapter<GPU> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, cards);

        countriesList.setAdapter(adapter);
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                GPU gpu = cards.get(i);
                Intent intent = new Intent(getApplicationContext(), ActivityDescription.class);
                intent.putExtra("title", gpu.getTitle());
                intent.putExtra("dep", gpu.getDep());
                startActivity(intent);
            }
        });

    }
}