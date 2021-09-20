package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class AttractionsAdapter extends ArrayAdapter<Attractions> {

    public AttractionsAdapter(Activity context, ArrayList<Attractions> attractions) {
        super(context, 0 , attractions);
    }
}
