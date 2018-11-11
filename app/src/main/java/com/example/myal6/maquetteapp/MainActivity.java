package com.example.myal6.maquetteapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void creationListPage (View view) {
        startActivity(new Intent(this, creationListPage.class));
    }

    public void researchObjectPage (View view) {
        startActivity(new Intent(this, researchObjectPage.class));
    }

    public void scanCodePage (View view) {
        startActivity(new Intent(this, scanCodePage.class));
    }

    public void shareListPage (View view) {
        startActivity(new Intent(this, shareListPage.class));
    }
}


