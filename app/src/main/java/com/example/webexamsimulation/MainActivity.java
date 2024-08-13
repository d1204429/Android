package com.example.webexamsimulation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{


    private ArrayList<Todo> todoArrayList = new ArrayList<Todo>();
    private ActivityResultLauncher<Intent> intentActivityResultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 設置 window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (view, windowInsetsCompat) -> {
            Insets systemBars = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return windowInsetsCompat;
        });


    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
