package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Bundle;

public class YoutTubeActivity extends AppCompatActivity {
    MotionLayout motionLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yout_tube);
        getSupportActionBar().hide();

        motionLayout = findViewById(R.id.motionLayout);
        motionLayout.setProgress(1.0f);
    }
}