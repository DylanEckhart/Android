package com.example.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        /* Rijksmuseum */
        // Find the View that shows the Rijksmuseum category
        TextView rijksmuseum = findViewById(R.id.rijksmuseum_home_text);

        // Set a click listener on that View
        rijksmuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rijksmuseumIntent = new Intent(MainActivity.this, RijksmuseumActivity.class);
                startActivity(rijksmuseumIntent);
            }
        });

        /* Anne Frank Huis */
        // Find the View that shows the Anne Frank Huis category
        TextView anneFrankHuis = findViewById(R.id.anne_frank_huis_home_text);

        // Set a click listener on that View
        anneFrankHuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anneFrankHuisIntent = new Intent(MainActivity.this, AnneFrankHuisActivity.class);
                startActivity(anneFrankHuisIntent);
            }
        });

        /* Vondelpark */
        // Find the View that shows the Vondelpark category
        TextView vondelpark = findViewById(R.id.vondelpark_home_text);

        // Set a click listener on that View
        vondelpark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vondelparkIntent = new Intent(MainActivity.this, VondelparkActivity.class);
                startActivity(vondelparkIntent);
            }
        });

        /* Nemo */
        // Find the View that shows the Nemo category
        TextView nemo = findViewById(R.id.nemo_home_text);

        // Set a click listener on that View
        nemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nemoIntent = new Intent(MainActivity.this, NemoActivity.class);
                startActivity(nemoIntent);
            }
        });
    }
}