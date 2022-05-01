package com.example.a11week;

import android.icu.text.CaseMap;
import android.view.View;
import android.widget.Button;

public class StartClickListener implements View.OnClickListener {

    public Button btn;
    public TitleActivity ta;

    StartClickListener(Button button, TitleActivity titleActivity)
    {
        btn = button;
        ta = titleActivity;
    }

    @Override
    public void onClick(View view)
    {
        ta.LoadGame();
    }
}
