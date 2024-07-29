package com.example.implicit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

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

    //開啟特定網頁
    public void  FcuIndexPage(View view){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://ilearn.fcu.edu.tw/"));
        startActivity(i);
    }

    //開啟地圖 逢甲大學 1.放經緯度座標 or 2.指定搜尋目標(紅色標記)0,0?q=逢甲大學
    public void GotoFCU(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.179328524661425, 120.64735842026356"));
        startActivity(i);
    }

    public void clickDIAL(View view){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_DIAL);
        startActivity(i);

    }

    public void clickCall(View view){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+123456"));
        startActivity(i);

    }
}