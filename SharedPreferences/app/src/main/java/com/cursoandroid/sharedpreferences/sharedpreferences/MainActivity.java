package com.cursoandroid.sharedpreferences.sharedpreferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    private EditText nameText;
    private Button saveButton;
    private TextView showText;

    private static final String PREFERENCE_FILE = "PreferenceFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.editTextID);
        saveButton = findViewById(R.id.saveButtonID);
        showText = findViewById(R.id.showTextID);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCE_FILE,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if (nameText.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please, type your name", Toast.LENGTH_SHORT).show();
                }else {
                    editor.putString("name", nameText.getText().toString());
                    editor.commit();
                    showText.setText("Hello, " + nameText.getText().toString());
                }
            }
        });


        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCE_FILE,0);

        if (sharedPreferences.contains("name")){
            String userName = sharedPreferences.getString("name", "user not defined");
            showText.setText("Hello, "+ userName);
        }else{
            showText.setText("Hello, undefined user");
        }


    }
}
