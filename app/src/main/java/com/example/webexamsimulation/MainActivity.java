package com.example.webexamsimulation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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


        //實作初始list文字
        ListView todoListView = (ListView) findViewById(R.id.todoListView);
        if(todoArrayList.isEmpty()){
            //在 logcat 中輸出一條調試信息，表明待辦事項列表是空的。這有助於在調試過程中確認列表的狀態。
            Log.d("Test","todoArrayList empty.");
            ArrayList<String> empty = new ArrayList<String>();
            empty.add("還沒有待辦事項，趕緊去新增！");
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,empty);
            todoListView.setAdapter(adapter);
        }else {
            TodoAdapter adapter = new TodoAdapter(this,todoArrayList);
            todoListView.setAdapter(adapter);
            todoListView.setOnItemClickListener(this);
        }
    }




    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
