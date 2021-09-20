package com.example.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RijksmuseumActivity extends AppCompatActivity {

    String textInfoRijksmuseum = getString(R.string.info_rijksmuseum);
    String textTitleRijksmuseum = getString(R.string.title_rijksmuseum);
    int idImageRijksmuseum = R.drawable.rijksmuseum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
    }

    public com.example.android.tourguide.Attractions currentCategory = new com.example.android.tourguide.Attractions(textInfoRijksmuseum, textTitleRijksmuseum, idImageRijksmuseum);
}