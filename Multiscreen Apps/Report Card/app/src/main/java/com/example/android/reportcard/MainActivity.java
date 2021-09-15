package com.example.android.reportcard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView grades = findViewById(R.id.grades);
        ReportCard();
        grades.setText(toString());
    }

    double mathGrade, dutchGrade, englishGrade, historyGrade, artGrade, chemistryGrade;
    String reportGrades;
    String name = "Dylan";

    /**Get and set method for Math.*/
    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double grade) {
        mathGrade = grade;
    }

    /**Get en set method for Dutch.*/
    public double getDutchGrade() {
        return dutchGrade;
    }

    public void setDutchGrade(double grade) {
        dutchGrade = grade;
    }

    /**Get and set method for English.*/
    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double grade) {
        englishGrade = grade;
    }

    /**Get and set method for History.*/
    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double grade) {
        historyGrade = grade;
    }

    /**Get and set method for Art.*/
    public double getArtGrade() {
        return artGrade;
    }

    public void setArtGrade(double grade) {
        artGrade = grade;
    }

    /**Get and set method for Chemistry.*/
    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(double grade) {
        chemistryGrade = grade;
    }

    /** All identified grades.*/
    public void ReportCard() {
        setMathGrade(10);
        setDutchGrade(7.0);
        setEnglishGrade(7.4);
        setHistoryGrade(8.9);
        setArtGrade(5.6);
        setChemistryGrade(8.4);
    }

    /** Display the text.*/
    @NonNull
    @Override
    public String toString() {
        reportGrades = "Name: " + name;
        reportGrades += "\nMath grade: " + getMathGrade();
        reportGrades += "\nDutch grade: " + getDutchGrade();
        reportGrades += "\nEnglish grade: " + getEnglishGrade();
        reportGrades += "\nHistory grade: " + getHistoryGrade();
        reportGrades += "\nArt grade: " + getArtGrade();
        reportGrades += "\nChemistry grade: " + getChemistryGrade();
        return reportGrades;
    }
}