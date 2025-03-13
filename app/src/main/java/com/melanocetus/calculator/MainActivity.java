package com.melanocetus.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTxt1;
    EditText editTxt2;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTxt1 = findViewById(R.id.editTxt1);
        editTxt2 = findViewById(R.id.editTxt2);
        txtResult = findViewById(R.id.txtResult);
    }
    public void sum(View view) {
        if(editTxt1.getText().toString().matches("") || editTxt2.getText().toString().matches("")){
            txtResult.setText("Result: Sayıları Girin");
        }
        else {
            String num1 = editTxt1.getText().toString();
            String num2 = editTxt2.getText().toString();
            int result = Integer.parseInt(num1) + Integer.parseInt(num2);
            txtResult.setText("Result: " + result);
        }
    }

    public void deduct(View view) {
        if(editTxt1.getText().toString().matches("") || editTxt2.getText().toString().matches("")){
            txtResult.setText("Result: Sayıları Girin");
        }
        else {
            String num1 = editTxt1.getText().toString();
            String num2 = editTxt2.getText().toString();
            int result = Integer.parseInt(num1) - Integer.parseInt(num2);
            txtResult.setText("Result: " + result);
        }
    }

    public void multiply(View view) {
        if(editTxt1.getText().toString().matches("") || editTxt2.getText().toString().matches("")){
            txtResult.setText("Result: Sayıları Girin");
        }
        else {
            String num1 = editTxt1.getText().toString();
            String num2 = editTxt2.getText().toString();
            int result = Integer.parseInt(num1) * Integer.parseInt(num2);
            txtResult.setText("Result: " + result);
        }
    }

    public void divide(View view) {
        if(editTxt1.getText().toString().matches("") || editTxt2.getText().toString().matches("")){
            txtResult.setText("Result: Sayıları Girin");
        }
        else {
            String num1 = editTxt1.getText().toString();
            String num2 = editTxt2.getText().toString();
            int result = Integer.parseInt(num1) / Integer.parseInt(num2);
            txtResult.setText("Result: " + result);
        }
    }
}