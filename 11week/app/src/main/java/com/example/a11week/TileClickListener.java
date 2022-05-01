package com.example.a11week;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TileClickListener implements View.OnClickListener {

    public int a;
    public Button btn;
    public GameManager gm;
    public TextView tv;
    public MainActivity ma;
    TileClickListener(int tile, Button button, GameManager gameManager, TextView textView, MainActivity mainActivity)
    {
        a = tile;
        btn = button;
        gm = gameManager;
        tv = textView;
        ma = mainActivity;
    }

    @Override
    public void onClick(View view)
    {
        if(gm.gameState == 3) // X턴
        {
            btn.setText("X");
            btn.setEnabled(false);
            gm.map[a] = 1;
            gm.t++;
            tv.setText("O's Turn");
            gm.Update();
            ma.FinishGame();
        }
        else if(gm.gameState == 4) // O턴
        {
            btn.setText("O");
            btn.setEnabled(false);
            gm.map[a] = 2;
            gm.t++;
            tv.setText("X's Turn");
            gm.Update();
            ma.FinishGame();
        }
    }
}
