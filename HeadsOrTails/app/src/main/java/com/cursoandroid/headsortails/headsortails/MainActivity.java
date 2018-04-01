package com.cursoandroid.headsortails.headsortails;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView playButton;
    private String[] option = {"cara", "coroa"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButtonID);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomize = new Random();

                int numberRandom = randomize.nextInt(2);

                Intent intent = new Intent(MainActivity.this, PlayActivity.class);

                intent.putExtra("option", option[numberRandom]);

                startActivity(intent);

            }
        });

    }
}
