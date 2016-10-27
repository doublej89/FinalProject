package com.udacity.gradle.androidjokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AndroidJokeLibActivity extends AppCompatActivity {
    public static final String JOKE_RECIEVED_KEY = "rjk";
    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_joke_lib);

        Intent intent = getIntent();
        if (intent.hasExtra(JOKE_RECIEVED_KEY)) {
            mJoke = intent.getStringExtra(JOKE_RECIEVED_KEY);
        }

        TextView jokeView = (TextView) findViewById(R.id.joke_view);
        jokeView.setText(mJoke);
    }
}
