package com.cursoandroid.whatserie.whatserie;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private ImageView showImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBarID);
        showImage = findViewById(R.id.showImageID);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int progressValue = progress;

                if (progressValue == 1){
                    showImage.setImageResource(R.drawable.pouco);
                }else if (progressValue == 2) {
                    showImage.setImageResource(R.drawable.medio);
                }else if (progressValue == 3) {
                    showImage.setImageResource(R.drawable.muito);
                }else if (progress == 4){
                    showImage.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
