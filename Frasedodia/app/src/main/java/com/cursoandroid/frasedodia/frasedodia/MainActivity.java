package com.cursoandroid.frasedodia.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonNewPhrase;
    private TextView textNewPhrase;
    private String[] phrases = {
            "O importante não é vencer todos os dias, mas lutar sempre.",
            "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
            "É melhor conquistar a si mesmo do que vencer mil batalhas.",
            "Enquanto houver vontade de lutar haverá esperança de vencer.",
            "Difícil é ganhar um amigo em uma hora; fácil é ofendê-lo em um minuto.",
            "O medo de perder tira a vontade de ganhar.",
            "Aquele que não tem confiança nos outros, não lhes pode ganhar a confiança.",
            "Escolher o seu tempo é ganhar tempo.",
            "Arriscamo-nos a perder quando queremos ganhar demais.",
            "Muitos sabem ganhar dinheiro, mas poucos sabem gastá-lo."
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNewPhrase = findViewById(R.id.buttonNewPhraseId);
        textNewPhrase = findViewById(R.id.textNewPhraseId);

        buttonNewPhrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomize = new Random();

                int randomizeNumber = randomize.nextInt(phrases.length);

                textNewPhrase.setText(phrases[randomizeNumber]);

            }
        });
    }
}
