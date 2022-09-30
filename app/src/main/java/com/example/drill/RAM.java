package com.example.drill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RAM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram);

        ArrayList<GPU> cards = new ArrayList<GPU>();

        cards.add(new GPU("G.SKILL Trident Z RGB", "тип: DDR4, объем одного модуля: 16 ГБ, объем одного модуля (точно): 16 ГБ, тактовая частота: 3200 МГц, форм-фактор: DIMM, количество модулей в комплекте: 2 шт., CL: 14, особенности: RGB-подсветка, XMP, игровая, радиатор"));
        cards.add(new GPU("Samsung M378A4G43MB1-CTD", "Samsung M378A4G43MB1-CTD DDR4 UDIMM – двухранговые модули оперативной памяти объемом 32 ГБ, которые позволяют организовать очень емкую подсистему ОЗУ. Теперь даже на платах с двумя DIMM-слотами можно будет установить 64 ГБ памяти в двухканальном режиме. А обладатели рабочих станций под управлением AMD Ryzen Threadripper смогут установить до 256 гб озу."));
        cards.add(new GPU("Thermaltake TOUGHRAM RGB", "В наборе поставляются два модуля объемом по 8 ГБ, которые выделяются оригинальным дизайном теплораспределителей и интегрированной подсветкой RGB. Конструкция радиаторов способствует эффективному охлаждению чипов памяти даже при длительных игровых сеансах. Благодаря чипам памяти стандарта DDR4, низким задержкам и тактовой частоте в пределах 4000 МГц ОЗУ Thermaltake TOUGHRAM RGB обеспечивают реалистичность графики и плавность изображения в играх."));

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