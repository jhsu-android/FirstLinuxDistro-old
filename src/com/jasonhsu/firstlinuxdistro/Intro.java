package com.jasonhsu.firstlinuxdistro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intro extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void showOptions(View v) {
        startActivity(new Intent(this, FragmentQuestions.class));
    }
}
