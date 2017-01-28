package com.example.jokedroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDroidActivity extends AppCompatActivity {

    String joke;
    TextView jokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_droid);

       joke =  getIntent().getExtras().getString("joke");
        jokeView = (TextView) findViewById(R.id.joke_textview);
        jokeView.setText(joke);

    }
}
