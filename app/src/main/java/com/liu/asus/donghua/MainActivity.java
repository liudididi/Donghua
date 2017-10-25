package com.liu.asus.donghua;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyCustomCircleArrowView myCustomCircleArrowView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCustomCircleArrowView = (MyCustomCircleArrowView) findViewById(R.id.my_view);
    }
        //点击改变颜色

    public void onClick(View view) {
        myCustomCircleArrowView.setColor(Color.BLUE);
    }

    //点击加速
    public void add(View view) {
        myCustomCircleArrowView.speed();
    }

    //点击减速
    public void slow(View view) {
        myCustomCircleArrowView.slowDown();
    }

    //点击暂停、开始
    public void pauseOrStart(View view) {
        myCustomCircleArrowView.pauseOrStart();
    }



}
