package com.example.drill;

import static com.example.drill.R.id.title_textView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        TextView title_textView = findViewById(R.id.title_textView);
        TextView dep_textView = findViewById(R.id.dep_textView);
        Bundle arg = getIntent().getExtras();

        title_textView.setText(arg.get("title").toString());

        dep_textView.setText(arg.get("dep").toString());
    }
}