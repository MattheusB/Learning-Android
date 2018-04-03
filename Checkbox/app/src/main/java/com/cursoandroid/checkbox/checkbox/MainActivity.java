package com.cursoandroid.checkbox.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.zip.CheckedInputStream;

public class MainActivity extends Activity {

    private CheckBox dogsCheckbox;
    private CheckBox catsCheckbox;
    private CheckBox perrotCheckbox;
    private Button showButton;
    private TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogsCheckbox = findViewById(R.id.dogCheckboxID);
        catsCheckbox = findViewById(R.id.catCheckboxID);
        perrotCheckbox = findViewById(R.id.perrotCheckboxID);
        showButton = findViewById(R.id.buttonShowID);
        showText = findViewById(R.id.showTextID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedItems = "";

                selectedItems += "Item: " + dogsCheckbox.getText() + " " +  "Status: " + dogsCheckbox.isChecked() + "\n";
                selectedItems += "Item: " + catsCheckbox.getText()+ " " +"Status: " + catsCheckbox.isChecked() + "\n";
                selectedItems += "Item: " + perrotCheckbox.getText() + " " + "Status: " + perrotCheckbox .isChecked();

                showText.setText(selectedItems);


            }
        });


    }
}
