package com.barisgungor.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1Text;
    private EditText number2Text;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view){
        if (number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()){
            resultText.setText(R.string.enter_number);
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;
            resultText.setText(getString(R.string.result, result));
        }
    }

    public void deduct(View view) {
        if (number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()){
            resultText.setText(R.string.enter_number);
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;
            resultText.setText(getString(R.string.result, result));
        }
    }

    public void multiply(View view){
        if (number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()){
            resultText.setText(R.string.enter_number);
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;
            resultText.setText(getString(R.string.result, result));
        }
    }

    public void divide(View view){
        if (number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()){
            resultText.setText(R.string.enter_number);
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            if (number2 == 0) {
                resultText.setText(R.string.divide_by_zero);
            } else {
                int result = number1 / number2;
                resultText.setText(getString(R.string.result, result));
            }
        }
    }
}
