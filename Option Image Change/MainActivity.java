package com.cookandroid.a321p4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    ImageView imgPet;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이미지 바꾸기");

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        imgPet = (ImageView)findViewById(R.id.imgPet);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        menu.add(0, 1, 0, "강아지");
        menu.add(0, 2, 0, "고양이");
        menu.add(0, 3, 0, "토끼");


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                imgPet.setImageResource(R.drawable.dog);
                return true;
            case 2:
                imgPet.setImageResource(R.drawable.cat);
                return true;
            case 3:
                imgPet.setImageResource(R.drawable.rabbit);
                return true;

        }
        return false;
    }

}
