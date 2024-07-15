package com.example.activitypractice2;

import android.content.Intent;
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

    public void SentFruitName(View view){
        //按下按鈕A 傳apple 按下按鈕B 傳banana
        String fruit;
        if (view.getId() == R.id.buttonA){
            fruit = "Apple";
        }else{
            fruit = "Banana";
        }
        Intent intent = new Intent(this, FruitActivity.class);

        //設定一個傳送用的包裹
        Bundle bundle = new Bundle();
        //像map一樣有key值須給他key值
        bundle.putString("FRUIT",fruit);
        //利用intent攜帶bundle資料
        intent.putExtras(bundle);
        startActivity(intent);

    }
}