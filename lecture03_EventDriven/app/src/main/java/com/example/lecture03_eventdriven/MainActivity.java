package com.example.lecture03_eventdriven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(android.view.View v) {
        Log.e("test용 오류", "교수님의 강의에는 벽이 느껴져요\n\n\"완벽\"\n-소녀팬 올림-");
    }
}