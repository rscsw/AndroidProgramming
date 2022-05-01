package com.example.a11week;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GameManager gm = new GameManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gm.Init();

        TextView tv = (TextView)findViewById(R.id.textView_gameState);

        Button[] btn = new Button[9];
        btn[0] = (Button)findViewById(R.id.button_0_0);
        btn[1] = (Button)findViewById(R.id.button_0_1);
        btn[2] = (Button)findViewById(R.id.button_0_2);
        btn[3] = (Button)findViewById(R.id.button_1_0);
        btn[4] = (Button)findViewById(R.id.button_1_1);
        btn[5] = (Button)findViewById(R.id.button_1_2);
        btn[6] = (Button)findViewById(R.id.button_2_0);
        btn[7] = (Button)findViewById(R.id.button_2_1);
        btn[8] = (Button)findViewById(R.id.button_2_2);

        tv.setText("X's Turn");
        TileClickListener[] tileListener = new TileClickListener[9];
        for(int i = 0; i < 9; i++)
        {
            tileListener[i] = new TileClickListener(i, btn[i], gm, tv, this);
        }

        for(int i = 0; i < 9; i++)
        {
            btn[i].setOnClickListener(tileListener[i]);
        }
    }

    public void FinishGame()
    {
        if(gm.gameState == 0)
        {
            Intent intent = new Intent(this, GameOverActivity.class);
            intent.putExtra("gameState", 0);
            startActivity(intent);
        }
        else if(gm.gameState == 1)
        {
            Intent intent = new Intent(this, GameOverActivity.class);
            intent.putExtra("gameState", 1);
            startActivity(intent);
        }
        else if(gm.gameState == 2)
        {
            Intent intent = new Intent(this, GameOverActivity.class);
            intent.putExtra("gameState", 2);
            startActivity(intent);
        }
    }
}