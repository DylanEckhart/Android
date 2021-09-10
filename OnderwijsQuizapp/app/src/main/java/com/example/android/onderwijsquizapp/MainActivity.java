package com.example.android.onderwijsquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    // Check if Vraag 2 is answered correctly
    public boolean controlleerAntwoord2() {
        antwoordVraag2 = "HyperText Markup Language";
        EditText vraag2 = findViewById(R.id.insert_vraag_2);
        gegevenAntwoordVraag2 = vraag2.getText().toString().toLowerCase(Locale.ROOT);

        isAntwoordVanVraag2Correct = gegevenAntwoordVraag2.equals(antwoordVraag2);
        return isAntwoordVanVraag2Correct;
    }

    /** Vraag 3 */
    int gegevenAntwoordVraag3;
    int correcteIDVraag3;
    boolean isAntwoordVanVraag3Correct = false;

    // Check if Vraag 3 is answered correctly
    public int controlleerAntwoord3() {
        RadioGroup vraag3_antwoorden = findViewById(R.id.vraag3_antwoorden);
        gegevenAntwoordVraag3 = vraag3_antwoorden.getCheckedRadioButtonId();
        RadioButton correcteAntwoordVraag3 = findViewById(R.id.vraag3_antwoord1);
        correcteIDVraag3 = correcteAntwoordVraag3.getId();

        isAntwoordVanVraag3Correct = gegevenAntwoordVraag3 == correcteIDVraag3;
        return gegevenAntwoordVraag3;
    }

    /** Vraag 4 */
    int gegevenAntwoordVraag4;
    int correcteIDVraag4;
    boolean isAntwoordVanVraag4Correct = false;

    // Check if Vraag 4 is answered correctly
    public int controlleerAntwoord4() {
        RadioGroup vraag4_antwoorden = findViewById(R.id.vraag4_antwoorden);
        gegevenAntwoordVraag4 = vraag4_antwoorden.getCheckedRadioButtonId();
        RadioButton correcteAntwoordVraag4 = findViewById(R.id.vraag4_antwoord1);
        correcteIDVraag4 = correcteAntwoordVraag4.getId();

        isAntwoordVanVraag4Correct = gegevenAntwoordVraag4 == correcteIDVraag4;
        return gegevenAntwoordVraag4;
    }

    public void submitAnswers(View view) {
        controlleerAntwoord1();
        controlleerAntwoord2();
        controlleerAntwoord3();
        controlleerAntwoord4();
    }

}