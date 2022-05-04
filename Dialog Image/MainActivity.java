package com.cookandroid.a322p6;
import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.RadioGroup);
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(
                        MainActivity.this);
                ImageView imageView = (ImageView) findViewById(R.id.imageView1);
                View PhotoView = View.inflate(MainActivity.this,R.layout.dialog1,null);
                dlg.setView(PhotoView);
                switch (radioGroup.getCheckedRadioButtonId())
                {
                    case R.id.radioButton1:
                        dlg.setTitle("강아지");
                        imageView.setImageResource(R.drawable.dog);
                        break;
                    case R.id.radioButton2:
                        dlg.setTitle("고양이");
                        imageView.setImageResource(R.drawable.cat);
                        break;
                    case R.id.radioButton3:
                        dlg.setTitle("토끼");
                        imageView.setImageResource(R.drawable.rabbit);
                        break;
                    case R.id.radioButton4:
                        dlg.setTitle("말");
                        imageView.setImageResource(R.drawable.horse);
                        break;
                }

                dlg.setPositiveButton("닫기",null);
                dlg.show();
            }
        });
    }
}
