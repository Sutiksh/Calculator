package com.apps.sutiksh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setTitle("Result");
        TextView resultTextView = findViewById(R.id.resultTextView);

        Bundle bundle = getIntent().getExtras();
        float answer = bundle.getFloat("key_answer");

        resultTextView.setText(String.valueOf(answer));
        }

    }

