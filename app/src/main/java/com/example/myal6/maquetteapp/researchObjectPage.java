package com.example.myal6.maquetteapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class researchObjectPage extends AppCompatActivity {

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.research_object_page);
    }

    public void checkList (View view) {startActivity(new Intent(this, checkList.class));}
}
