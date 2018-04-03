package com.cursoandroid.mediaplayer.mediaplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button playButton;
    private MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButtonID);

        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.music);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer.isPlaying()){
                    pauseSong();
                }else{
                    playSong();
                }

            }
        });

    }


    private void playSong(){
        if (mediaPlayer != null){
            mediaPlayer.start();
            playButton.setText("Pause");
        }
    }

    private void pauseSong(){
        if (mediaPlayer != null){
            mediaPlayer.pause();
            playButton.setText("Play");
        }
    }

    @Override
    protected void onDestroy() {

        if(mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;

        }
        super.onDestroy();
    }
}
