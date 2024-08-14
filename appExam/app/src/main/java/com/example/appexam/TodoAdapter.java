package com.example.appexam;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class TodoAdapter extends ArrayAdapter<Todo> {

    // 建構子，用於初始化適配器
    public TodoAdapter(@NonNull Context context, ArrayList<Todo> Todos) {
        super(context, 0, Todos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 取得當前位置的資料項目
        Todo todo = getItem(position);

        // 檢查是否有可重用的視圖，否則加載新的視圖
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.todo_view, parent, false);
        }

        // 查找視圖以填充資料
        TextView tv_title = (TextView) convertView.findViewById(R.id.listTvTitle);
        TextView tv_content = (TextView) convertView.findViewById(R.id.listTvContent);

        // 使用資料對象填充模板視圖
        tv_title.setText(todo.getTitle());
        String contentText = String.valueOf(todo.getContent());

        // 若內容文字長度超過10個字，則截取前10個字並加上省略號
        if (contentText.length() >= 10) {
            contentText = contentText.substring(0, 10) + "...";
        }
        tv_content.setText(contentText);

        // 返回已完成的視圖，以便在螢幕上渲染
        return convertView;
    }
}