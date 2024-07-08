package com.example.calculator;

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
    }

    public void addition (View view){
        TextView result2 =(TextView) findViewById(R.id.result2);
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2= (EditText) findViewById(R.id.input2);
        double one = Double.parseDouble(input1.getText().toString());
        double two = Double.parseDouble(input2.getText().toString());
        double temp = (double) (one+two);
        result2.setText(String.valueOf(temp));
    }

    public void subtraction (View view){
        TextView result2 =(TextView) findViewById(R.id.result2);
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2= (EditText) findViewById(R.id.input2);
        double one = Double.parseDouble(input1.getText().toString());
        double two = Double.parseDouble(input2.getText().toString());
        double temp = (double) (one-two);
        result2.setText(String.valueOf(temp));
    }

    public void multiplication (View view){
        TextView result2 =(TextView) findViewById(R.id.result2);
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2= (EditText) findViewById(R.id.input2);
        double one = Double.parseDouble(input1.getText().toString());
        double two = Double.parseDouble(input2.getText().toString());
        double temp = (double) (one*two);
        result2.setText(String.valueOf(temp));
    }

    public void division (View view){
        TextView result2 =(TextView) findViewById(R.id.result2);
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2= (EditText) findViewById(R.id.input2);
        double one = Double.parseDouble(input1.getText().toString());
        double two = Double.parseDouble(input2.getText().toString());
        double temp = (double) (one/two);
        result2.setText(String.valueOf(temp));
    }



}