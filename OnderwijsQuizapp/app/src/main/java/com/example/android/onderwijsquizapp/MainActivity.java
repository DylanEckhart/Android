package com.example.android.onderwijsquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call functions
        controlleerAntwoord1();
        controlleerAntwoord2();
    }

    /** Vraag 1 */
    String gegevenAntwoordVraag1;
    String antwoordVraag1;
    boolean isAntwoordVanVraag1Correct = false;

    // Check if Vraag 1 is answered correctly
    public boolean controlleerAntwoord1() {
        antwoordVraag1 = "Tim Berners-Lee";
        EditText vraag1 = findViewById(R.id.insert_vraag_1);
        gegevenAntwoordVraag1 = vraag1.getText().toString().toLowerCase(Locale.ROOT);

        isAntwoordVanVraag1Correct = gegevenAntwoordVraag1.equals(antwoordVraag1);
        return isAntwoordVanVraag1Correct;
    }

    /** Vraag 2 */
    String gegevenAntwoordVraag2;
    String antwoordVraag2;
    boolean isAntwoordVanVraag2Correct = false;

    // Check if Vraag 1 is answered correctly
    public boolean controlleerAntwoord2() {
        antwoordVraag2 = "HyperText Markup Language";
        EditText vraag2 = findViewById(R.id.insert_vraag_2);
        gegevenAntwoordVraag2 = vraag2.getText().toString().toLowerCase(Locale.ROOT);

        isAntwoordVanVraag2Correct = gegevenAntwoordVraag2.equals(antwoordVraag2);
        return isAntwoordVanVraag2Correct;
    }

    /** Vraag 3 */



}