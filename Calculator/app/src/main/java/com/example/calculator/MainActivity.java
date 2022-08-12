package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextAnswer = findViewById(R.id.editTextAnswer);
        Button buttonAnswer = findViewById(R.id.buttonAnswer);
        TextView textViewIncorrectAnswer = findViewById(R.id.textViewIncorrectAnswer);
        TextView textViewCorrectAnswer = findViewById(R.id.textViewCorrectAnswer);
        TextView textViewExample = findViewById(R.id.textViewExample);

        textViewExample.setText(R.string.TheSecondExample);

        buttonAnswer.setOnClickListener((l) -> {
            String text = editTextAnswer.getText().toString();
            if(text.equals("30")) {
                textViewCorrectAnswer.setVisibility(View.VISIBLE);
                textViewIncorrectAnswer.setVisibility(View.GONE);
            } else {
                textViewIncorrectAnswer.setVisibility(View.VISIBLE);
                textViewCorrectAnswer.setVisibility(View.GONE);
            }
        });
    }
}