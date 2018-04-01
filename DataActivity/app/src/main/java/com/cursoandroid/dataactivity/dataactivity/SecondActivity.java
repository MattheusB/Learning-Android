package com.cursoandroid.dataactivity.dataactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.textID);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String dataPassed = extra.getString("name");

            text.setText(dataPassed);

        }


    }
}
