package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class AttractionsAdapter extends ArrayAdapter<com.example.android.tourguide.Attractions> {

    public AttractionsAdapter(Activity context) {
        super(context, 0);
    }
}
