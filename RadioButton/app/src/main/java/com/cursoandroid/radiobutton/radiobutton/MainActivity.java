package com.cursoandroid.radiobutton.radiobutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {


    private RadioGroup radioGroup;
    private TextView showText;
    private Button chooseButton;
    private RadioButton chosenRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupID);
        showText = findViewById(R.id.showTextID);
        chooseButton = findViewById(R.id.buttonID);

        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButtonChoosen = radioGroup.getCheckedRadioButtonId();

                if (idRadioButtonChoosen > 0){
                    chosenRadioButton = findViewById(idRadioButtonChoosen);
                    showText.setText(chosenRadioButton.getText());
                }

            }
        });

    }
}
