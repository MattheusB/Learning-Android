package com.cursoandroid.headsortails.headsortails;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {

    private ImageView backButton;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        backButton = findViewById(R.id.backButtonID);
        image = findViewById(R.id.imageID);



                Bundle extra = getIntent().getExtras();

                if (extra != null) {
                    String selected = extra.getString("option");

                    if(selected.equals("cara")){
                        image.setImageDrawable(ContextCompat.getDrawable(PlayActivity.this,R.drawable.moeda_cara));

                    }else {
                        image.setImageDrawable(ContextCompat.getDrawable(PlayActivity.this, R.drawable.moeda_coroa));
                    }


                }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayActivity.this,MainActivity.class));
            }
        });

            }




}
