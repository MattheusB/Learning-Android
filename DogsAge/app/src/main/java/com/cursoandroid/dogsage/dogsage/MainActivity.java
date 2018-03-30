package com.cursoandroid.dogsage.dogsage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonAge;
    private EditText boxNumber;
    private TextView resultAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAge = findViewById(R.id.buttonAgeId);
        boxNumber = findViewById(R.id.boxNumberId);
        resultAge =  findViewById(R.id.resultId);


       buttonAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAge = boxNumber.getText().toString();


                if(textAge.isEmpty()){
                    resultAge.setText("No number entered");
                }else {
                    int age = Integer.parseInt(textAge);
                    int finalResult = age * 7;

                    resultAge.setText("The age of dog in human years is: " + finalResult + " years.");
                }

            }
        });

    }
}
