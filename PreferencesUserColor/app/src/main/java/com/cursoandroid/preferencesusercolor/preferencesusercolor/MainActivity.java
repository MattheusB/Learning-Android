package com.cursoandroid.preferencesusercolor.preferencesusercolor;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    private RadioGroup radioGroup;
    private RadioButton selectedButton;
    private Button saveButton;
    private static final String PREFERENCES_FILE = "PreferencesFile";
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupID);
        saveButton = findViewById(R.id.saveButtonID);
        layout = findViewById(R.id.layoutID);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedRadioButtonID = radioGroup.getCheckedRadioButtonId();
                selectedButton = findViewById(selectedRadioButtonID);

                if (selectedRadioButtonID > 0){
                    SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCES_FILE,0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();

                    String selectedColor = selectedButton.getText().toString();

                    editor.putString("color", selectedColor);
                    editor.commit();

                    setBackground(selectedColor);



                }
            }
        });

        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCES_FILE,0);
        if (sharedPreferences.contains("color")){
            String recoveredColor = sharedPreferences.getString("color", "White");
            setBackground(recoveredColor);
        }


    }
    private void setBackground(String color){
        if(color.equalsIgnoreCase("blue")){
            layout.setBackgroundColor(Color.parseColor("#495b7c"));

        }else if (color.equalsIgnoreCase("orange")){
            layout.setBackgroundColor(Color.parseColor("#ffce26"));

        }else if (color.equalsIgnoreCase("green")){
            layout.setBackgroundColor(Color.parseColor("#009670"));
        }
    }
}
