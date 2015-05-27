package com.luct.minal.sound;

import android.app.Activity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;


import com.luct.minal.sound.Effects;

public class MainActivity extends Activity implements OnClickListener {
    private Button button;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init Effects class
        Effects.getInstance().init(this);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Effects.getInstance().playSound(Effects.SOUND_1);
    }
}
