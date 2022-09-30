package com.example.drill;

import androidx.annotation.NonNull;

public class GPU {
    String title;
    String dep;

    GPU(String title, String dep){
        this.title = title;
        this.dep = dep;
    }
    String getTitle() {return title;}
    String getDep() {return dep;}

    @NonNull
    @Override
    public String toString() {return title;}
}
