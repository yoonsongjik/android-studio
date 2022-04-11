package com.cookandroid.a6_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout purple, blue, yellow, black;

        purple=findViewById(R.id.purple);
        blue=findViewById(R.id.blue);
        yellow=findViewById(R.id.yellow);
        black=findViewById(R.id.black);
        final int[] width = new int[1];
        final int[] height = new int[1];

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width[0] = purple.getWidth();
                height[0] = purple.getHeight();
                Toast.makeText(getApplication(),"가로"+ width[0] + ",세로 :" + height[0], Toast.LENGTH_SHORT).show();
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width[0] = blue.getWidth();
                height[0] = blue.getHeight();
                Toast.makeText(getApplication(),"가로"+ width[0]+",세로 :"+ height[0], Toast.LENGTH_SHORT).show();
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width[0] = yellow.getWidth();
                height[0] = yellow.getHeight();
                Toast.makeText(getApplication(),"가로"+ width[0]+",세로 :"+ height[0], Toast.LENGTH_SHORT).show();
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width[0] = black.getWidth();
                height[0] = black.getHeight();
                Toast.makeText(getApplication(),"가로"+ width[0]+",세로 :"+ height[0], Toast.LENGTH_SHORT).show();
            }
        });

    }
}