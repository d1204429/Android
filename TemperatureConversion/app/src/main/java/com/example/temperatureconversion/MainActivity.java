package com.example.temperatureconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    public void cfConversion(View view) {
        TextView conversion = (TextView) findViewById(R.id.conversion);
        EditText temperature = (EditText) findViewById(R.id.temperature);
        int c = Integer.parseInt(temperature.getText().toString());
        float f = (float) (9 / 5 * c + 32);
        conversion.setText(String.valueOf(f));

    }

    public void fcConversion(View view) {
        TextView conversion = (TextView) findViewById(R.id.conversion);
        EditText temperature = (EditText) findViewById(R.id.temperature);
        int f = Integer.parseInt(temperature.getText().toString());
        float c = (float) ((f - 32) * 5 / 9);
        conversion.setText(String.valueOf(c));

    }
}