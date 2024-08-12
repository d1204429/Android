package com.example.webexamsimulation;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> todoList;
    private ArrayAdapter<String> adapter;

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

        // 初始化 ListView 和待辦事項列表
        listView = findViewById(R.id.listView);
        todoList = new ArrayList<>();

        // 檢查是否有待辦事項，如果沒有則添加佔位字串
        checkAndShowPlaceholder();

        // 創建 ArrayAdapter 並綁定到 ListView
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, todoList);
        listView.setAdapter(adapter);
    }

    private void checkAndShowPlaceholder() {
        if (todoList.isEmpty()) {
            todoList.add("還沒有待辦事項，趕緊去新增！");
        }
    }

    // 當有新待辦事項添加時，更新列表
    private void addTodoItem(String newItem) {
        if (todoList.size() == 1 && todoList.get(0).equals("還沒有待辦事項，趕緊去新增！")) {
            todoList.clear(); // 移除佔位字串
        }
        todoList.add(newItem);
        adapter.notifyDataSetChanged(); // 通知 ListView 更新
    }
}
