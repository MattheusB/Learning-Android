package com.cursoandroid.gasolinaoualcool.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcoolId);
        precoGasolina = findViewById(R.id.precoGasolinaId);
        botaoVerificar = findViewById(R.id.botaoVerificarId);
        textoResultado = findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoAlcool = precoAlcool.getText().toString();
                String textoGasolina = precoGasolina.getText().toString();

                double valorAlcool = Double.parseDouble(textoAlcool);
                double valorGasolina = Double.parseDouble(textoGasolina);

                double valorResultado = valorAlcool/valorGasolina;

                if (valorResultado > 0.7){
                    textoResultado.setText("É melhor utilizar Gasolina.");
                }
                else {
                    textoResultado.setText("É melhor utilizar Álcool");
                }
            }
        });

    }





}
