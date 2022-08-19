package com.br.up.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;

    private Button buttonAction;
    private ArrayList<String> messages = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = findViewById(R.id.text_title);
        buttonAction= findViewById(R.id.button_action);


        messages.add("Criar o Whatszap2");
        messages.add("Criar o Whatszap3");
        messages.add("Criar um partido Marxista-Leninista");
        messages.add("Criar o Whatszap4");



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int index = random.nextInt(messages.size());
                String message = messages.get(index);

                textViewTitle.setText((message));



//                textViewTitle.setText("Eu faço parte do partido comunista chines");


            }
        };

        buttonAction.setOnClickListener(listener);

    }
}