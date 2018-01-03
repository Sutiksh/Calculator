package com.apps.sutiksh.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.channels.FileLock;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText number1Text;
    private EditText number2Text;
    private FloatingActionButton addButton;
    private FloatingActionButton clearButton;
    private FloatingActionButton multiplyButton;
    private FloatingActionButton subButton;
    private FloatingActionButton divideButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        addButton = findViewById(R.id.addButton);
        clearButton = findViewById(R.id.clearButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        subButton = findViewById(R.id.subButton);
        divideButton = findViewById(R.id.divideButton);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1Text.setText("");
                number2Text.setText("");
                number1Text.requestFocus();
            }
        });
    }

    /*private void displayAlertMessage(int answer){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Answer");
        builder.setMessage("Answer is " + answer);
        builder.setCancelable(false);
        builder.setPositiveButton("yes",null);
        builder.setNegativeButton("no",null);
        builder.setNeutralButton("cancel",null);
        builder.show();
    }*/

    @Override
    public void onClick(View v) {
        String num1 = number1Text.getText().toString();
        String num2 = number2Text.getText().toString();

        float n1 = Float.parseFloat(num1);
        float n2 = Float.parseFloat(num2);

        float answer = 0;

        switch (v.getId()){
            case R.id.addButton:
                answer = n1 + n2;
                break;
            case R.id.subButton:
                answer = n1 - n2;
                break;
            case R.id.multiplyButton:
                answer = n1 * n2;
                break;
            case R.id.divideButton:
                answer = n1 / n2;
                break;
        }

        //displayAlertMessage(answer);
        Intent intent = new Intent(CalculatorActivity.this,ResultActivity.class);
        Bundle bundle = new Bundle();
        bundle.putFloat("key_answer", answer);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}




