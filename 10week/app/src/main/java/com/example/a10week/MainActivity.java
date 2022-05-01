package com.example.a10week;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    Button btn11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button)findViewById(R.id.button_start);
        btn11 = (Button)findViewById(R.id.button_1_1);

        StartButtonEventListener sListener = new StartButtonEventListener(btn11);

        btnStart.setOnClickListener(sListener);
    }
}
