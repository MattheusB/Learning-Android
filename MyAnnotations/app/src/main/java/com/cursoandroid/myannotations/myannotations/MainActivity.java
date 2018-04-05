package com.cursoandroid.myannotations.myannotations;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends Activity {

    private EditText text;
    private ImageView saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textID);
        saveButton = findViewById(R.id.saveButtonID);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String typedText = text.getText().toString();
                saveText(typedText);


            }
        });
    }


    private void saveText(String text){
        try{
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput("file annotation.txt", Context.MODE_PRIVATE));
            outputStreamWriter.write(text);
            outputStreamWriter.close();


        }catch (IOException e){
            Log.v("MainActivity", e.toString());
        }

    }

    private String readFile(){
        String result = "";
        try{
            InputStream file = openFileInput("file annotation.txt");

            if (file != null){
                InputStreamReader inputStreamReader = new InputStreamReader(file);


                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                bufferedReader.readLine();
            }
        }catch (IOException e){
            Log.v("MainActivity", e.toString());

        }


        return result;
    }
}
