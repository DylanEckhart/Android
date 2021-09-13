package com.example.android.miwok;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Intent for NumbersClickListener.java
        NumbersClickListener clickListener = new NumbersClickListener();
        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(clickListener);
    }

}
