package com.example.drill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Processor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processor);
        ArrayList<GPU> cards = new ArrayList<GPU>();

        cards.add(new GPU("CORE I9-7960X", "socket: LGA2066, линейка процессоров: Intel Core i9, количество ядер: 16, техпроцесс: 14 нм, частота процессора: 2800 МГц, тип памяти: DDR4, ядро: Skylake-X, Объем кэша L3: 22 МБ, тепловыделение: 165 Вт, игровой"));
        cards.add(new GPU("CORE I9-7980XE", "socket: LGA2066, линейка процессоров: Intel Core i9, количество ядер: 18, техпроцесс: 14 нм, частота процессора: 2600 МГц, тип памяти: DDR4, ядро: Skylake-X, Объем кэша L3: 24.75 МБ, тепловыделение: 165 Вт, игровой"));
        cards.add(new GPU("CORE I9-10980XE EXTREME EDITION", "Intel Core i9-10980XE — это 18-ти ядерный процессор, который выпускается по нормам 14-нм техпроцесса. Тактовая частота процессора составляет 3 ГГц, которую можно увеличить до 4.6 ГГц при задействовании режима Turbo Boost. Объем кэш-памяти 3 уровня равен 24.75 МБ."));

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