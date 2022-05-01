package com.example.a11week;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        Button btn = (Button)findViewById(R.id.button_title);

        StartClickListener listener = new StartClickListener(btn, this);

        btn.setOnClickListener(listener);
    }

    public void LoadGame()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}