package com.example.android.tourguideapp;

import android.content.Context;
import android.widget.ArrayAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TextsAdapter extends ArrayAdapter<Text> {

    public WordAdapter(Context context, ArrayList<Text> texts) {
        super(context, 0, texts);
    }
}
