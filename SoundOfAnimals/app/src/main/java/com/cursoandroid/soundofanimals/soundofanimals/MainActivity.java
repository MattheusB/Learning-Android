package com.cursoandroid.soundofanimals.soundofanimals;

import android.app.Activity;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView dog;
    private ImageView cat;
    private ImageView lion;
    private ImageView monkey;
    private ImageView sheep;
    private ImageView cow;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog = findViewById(R.id.dogID);
        cat = findViewById(R.id.catID);
        lion = findViewById(R.id.lionID);
        monkey = findViewById(R.id.monkeyID);
        sheep = findViewById(R.id.sheepID);
        cow = findViewById(R.id.cowID);

        dog.setOnClickListener(this);
        cat.setOnClickListener(this);
        lion.setOnClickListener(this);
        monkey.setOnClickListener(this);
        sheep.setOnClickListener(this);
        cow.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dogID:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.cao);
                playSong();
                break;
            case R.id.catID:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato);
                playSong();
                break;
            case R.id.lionID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                playSong();
                break;
            case R.id.monkeyID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                playSong();
                break;
            case R.id.sheepID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                playSong();
                break;
            case R.id.cowID:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                playSong();
                break;
        }
    }

    public void playSong(){
        if (mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
