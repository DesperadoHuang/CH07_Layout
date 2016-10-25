package com.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgBt1, imgBt2, imgBt3, imgBt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBt1 = (ImageButton) findViewById(R.id.imageButton);
        imgBt2 = (ImageButton) findViewById(R.id.imageButton2);
        imgBt3 = (ImageButton) findViewById(R.id.imageButton3);
        imgBt4 = (ImageButton) findViewById(R.id.imageButton4);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton:
                imgBt1.setVisibility(View.INVISIBLE);
                break;
            case R.id.imageButton2:
                imgBt2.setVisibility(View.INVISIBLE);
                break;
            case R.id.imageButton3:
                imgBt3.setVisibility(View.INVISIBLE);
                break;
            case R.id.imageButton4:
                imgBt1.setVisibility(View.VISIBLE);
                imgBt2.setVisibility(View.VISIBLE);
                imgBt3.setVisibility(View.VISIBLE);
                break;

        }
    }
}
