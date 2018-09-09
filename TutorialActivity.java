package com.example.wendy.yenko;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class TutorialActivity extends AppCompatActivity {

    private ViewPager mPager;
    private int [] layouts = {R.layout.slide_zero, R.layout.first_slide, R.layout.second_slide, R.layout.third_slide,
            R.layout.fourth_slide, R.layout.fifth_slide, R.layout.sixth_slide, R.layout.seventh_slide,
            R.layout.eighth_slide, R.layout.nineth_slide, R.layout.tenth_slide, R.layout.eleventh_slide};

    private MpageAdapter mpageAdapter;
    Button btnTUTskip, btnTUTproceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        mPager = (ViewPager) findViewById(R.id.viewPaper);
        mpageAdapter = new MpageAdapter(layouts,this);
        mPager.setAdapter(mpageAdapter);
    }
}
