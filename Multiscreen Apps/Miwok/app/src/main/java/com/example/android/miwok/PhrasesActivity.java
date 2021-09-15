package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Array for the English words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?", "minto wuksus", R.drawable.family_father));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", R.drawable.family_father));
        words.add(new Word("My name is...", "oyaaset...", R.drawable.family_father));
        words.add(new Word("How are you feeling?", "michәksәs?", R.drawable.family_father));
        words.add(new Word("I'm feeling good.", "kuchi achit", R.drawable.family_father));
        words.add(new Word("Are you coming?", "әәnәs'aa?", R.drawable.family_father));
        words.add(new Word("Yes, I'm coming.", "hәә’ әәnәm", R.drawable.family_father));
        words.add(new Word("I'm coming.", "әәnәm", R.drawable.family_father));
        words.add(new Word("Let's go.", "yoowutis", R.drawable.family_father));
        words.add(new Word("Come here.", "әnni'nem", R.drawable.family_father));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}