package com.cookandroid.a4_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    CheckBox che1, che2, che3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);

        che1=(CheckBox) findViewById(R.id.che1);
        che2=(CheckBox) findViewById(R.id.che2);
        che3=(CheckBox) findViewById(R.id.che3);

        che1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                {
                    btn1.setEnabled(false);
                }
                else
                {
                    btn1.setEnabled(true);
                }

            }
        });
        che2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                {
                    btn1.setClickable(true);
                }
                else
                    btn1.setClickable(false);
            }
        });

        che3.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                {
                    btn1.setRotation(45);
                }
                else
                    btn1.setRotation(0);
            }
        }));

    }
}