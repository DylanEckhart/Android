package com.example.android.onderwijsquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

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
    public boolean controlleerAntwoord3() {
        RadioGroup vraag3_antwoorden = findViewById(R.id.vraag3_antwoorden);
        gegevenAntwoordVraag3 = vraag3_antwoorden.getCheckedRadioButtonId();
        RadioButton correcteAntwoordVraag3 = findViewById(R.id.vraag3_antwoord1);
        correcteIDVraag3 = correcteAntwoordVraag3.getId();

        isAntwoordVanVraag3Correct = gegevenAntwoordVraag3 == correcteIDVraag3;
        return isAntwoordVanVraag3Correct;
    }

    /** Vraag 4 */
    int gegevenAntwoordVraag4;
    int correcteIDVraag4;
    boolean isAntwoordVanVraag4Correct = false;

    // Check if Vraag 4 is answered correctly
    public boolean controlleerAntwoord4() {
        RadioGroup vraag4_antwoorden = findViewById(R.id.vraag4_antwoorden);
        gegevenAntwoordVraag4 = vraag4_antwoorden.getCheckedRadioButtonId();
        RadioButton correcteAntwoordVraag4 = findViewById(R.id.vraag4_antwoord1);
        correcteIDVraag4 = correcteAntwoordVraag4.getId();

        isAntwoordVanVraag4Correct = gegevenAntwoordVraag4 == correcteIDVraag4;
        return isAntwoordVanVraag4Correct;
    }

    // Set text for answer 1
    public String setTextQ1() {
        controlleerAntwoord1();
        String textScoreQ1 = "";

        if (isAntwoordVanVraag1Correct) {
            textScoreQ1 = "Je antwoord op vraag 1 is goed";
        } else {
            textScoreQ1 = "Je antwoord op vraag 1 is fout";
        }

        return textScoreQ1;
    }

    // Set text for answer 2
    public String setTextQ2() {
        controlleerAntwoord2();
        String textScoreQ2 = "";

        if (isAntwoordVanVraag2Correct) {
            textScoreQ2 = "Je antwoord op vraag 2 is goed";
        } else {
            textScoreQ2 = "Je antwoord op vraag 2 is fout";
        }

        return textScoreQ2;
    }

    // Set text for answer 3
    public String setTextQ3() {
        controlleerAntwoord3();
        String textScoreQ3 = "";

        if (isAntwoordVanVraag3Correct) {
            textScoreQ3 = "Je antwoord op vraag 3 is goed";
        } else {
            textScoreQ3 = "Je antwoord op vraag 3 is fout";
        }

        return textScoreQ3;
    }

    // Set text for answer 4
    public String setTextQ4() {
        controlleerAntwoord4();
        String textScoreQ4 = "";

        if (isAntwoordVanVraag4Correct) {
            textScoreQ4 = "Je antwoord op vraag 4 is goed";
        } else {
            textScoreQ4 = "Je antwoord op vraag 4 is fout";
        }

        return textScoreQ4;
    }

    /** Put answers into the submit button */
    public void setScoreText() {
        TextView scoreText = findViewById(R.id.score_counter);
        controlleerAntwoord1();
        controlleerAntwoord2();
        controlleerAntwoord3();
        controlleerAntwoord4();
        setTextQ1();
        setTextQ2();
        setTextQ3();
        setTextQ4();
        scoreText.setText(setTextQ1() + "\n" + setTextQ2() + "\n" +setTextQ3() + "\n" + setTextQ4());
    }

    public void submitAnswers(View view) {
        setScoreText();
        controlleerAntwoord1();
        controlleerAntwoord2();
        controlleerAntwoord3();
        controlleerAntwoord4();
    }

}