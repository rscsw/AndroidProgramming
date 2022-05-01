package com.example.a10week;

import android.view.View;
import android.widget.Button;

public class StartButtonEventListener implements View.OnClickListener
{
    Button btn11;
    StartButtonEventListener(Button btn) { btn11 = btn; }

    @Override
    public void onClick(View view) { btn11.setEnabled(true); }
}
