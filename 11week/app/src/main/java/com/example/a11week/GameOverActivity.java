package com.example.a11week;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        TextView tv = (TextView)findViewById(R.id.text_over);
        GameManager gm = new GameManager();

        Intent intent = getIntent();
        gm.gameState = intent.getIntExtra("gameState", 0);

        if(gm.gameState == 0)
        {
            tv.setText("Draw");
        }
        else if(gm.gameState == 1)
        {
            tv.setText("X Win");
        }
        else if(gm.gameState == 2)
        {
            tv.setText("O win");
        }
    }

    public void btnClick(View view)
    {
        Intent intent = new Intent(this, TitleActivity.class);
        startActivity(intent);
        finish();
    }
}