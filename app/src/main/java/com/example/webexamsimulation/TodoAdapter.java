package com.example.webexamsimulation;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class TodoAdapter extends ArrayAdapter<Todo> {

    public TodoAdapter(Context context, ArrayList<Todo> Todos){}
    super(context,0,Todos);

}