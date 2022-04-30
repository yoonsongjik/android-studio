package com.cookandroid.a237p7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.text.Layout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1
        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        //2
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0,1);

        //3
        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.MATCH_PARENT,1);

        // main
        LinearLayout Layout1 = new LinearLayout(this);
        Layout1.setOrientation(LinearLayout.VERTICAL);

        LinearLayout Layout2 = new LinearLayout(this);
        Layout2.setOrientation(LinearLayout.HORIZONTAL);
        Layout2.setLayoutParams(params2);

        LinearLayout Layout3 = new LinearLayout(this);
        Layout3.setOrientation(LinearLayout.VERTICAL);
        Layout3.setLayoutParams(params2);
        Layout3.setBackgroundColor(Color.rgb(0,0,255));

        LinearLayout Layout4 = new LinearLayout(this);
        Layout4.setOrientation(LinearLayout.VERTICAL);
        Layout4.setLayoutParams(params3);
        Layout4.setBackgroundColor(Color.rgb(255,0,0));

        LinearLayout Layout5 = new LinearLayout(this);
        Layout5.setOrientation(LinearLayout.VERTICAL);
        Layout5.setLayoutParams(params3);

        LinearLayout Layout6 = new LinearLayout(this);
        Layout6.setOrientation(LinearLayout.VERTICAL);
        Layout6.setLayoutParams(params2);
        Layout6.setBackgroundColor(Color.rgb(255,212,0));

        LinearLayout Layout7 = new LinearLayout(this);
        Layout7.setOrientation(LinearLayout.VERTICAL);
        Layout7.setLayoutParams(params2);
        Layout7.setBackgroundColor(Color.rgb(0,0,0));

        setContentView(Layout1,params1);
        Layout1.addView(Layout2);
        Layout1.addView(Layout3);
        Layout2.addView(Layout4);
        Layout2.addView(Layout5);
        Layout5.addView(Layout6);
        Layout5.addView(Layout7);
    }
}