package com.example.webexamsimulation;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class TodoActivity extends AppCompatActivity {

    String title,content,action;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_todo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 獲取從 MainActivity 傳遞過來的資料包（Bundle）
        Bundle bundle = this.getIntent().getExtras();
        action = bundle.getString("ACTION");

        // 如果動作是編輯，則將資料填入相應的輸入欄位
        if(bundle != null && action.equals("edit")) {
            title = String.format(bundle.getString("TITLE"));
            content = String.format(bundle.getString("CONTENT"));
            index = bundle.getInt("INDEX");

            EditText tvTitle = (EditText) findViewById(R.id.newTodoTitle);
            tvTitle.setText(title);
            TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.contentTextInputLayout);
            textInputLayout.getEditText().setText(content);
        }
    }
}