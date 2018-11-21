package com.example.myal6.maquetteapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class shareListPage extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_list_page);

        final Button button = (Button) findViewById(R.id.boutonShare1);
        button.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v) {
                String test = button.getText().toString();
                if (test == "+") {
                    button.setText("-");
                    //Toast.makeText(getApplicationContext(),"personne supprimée de la liste", Toast.LENGTH_LONG);
                }
                else {
                    button.setText("+");
                    //Toast.makeText(getApplicationContext(),"personne ajoutée à la liste", Toast.LENGTH_LONG);
                }
            }
        });
    }
}
