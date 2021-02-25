package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class SVGActivity extends AppCompatActivity {

    ImageView mIcAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svg);

        mIcAnim = findViewById(R.id.image);

        mIcAnim.setOnClickListener(view->{
            Drawable drawable = mIcAnim.getDrawable();
            if(drawable instanceof AnimatedVectorDrawable){
                AnimatedVectorDrawable anima = ((AnimatedVectorDrawable) drawable);

                if(anima.isRunning()){
                    anima.stop();
                }else{
                    anima.start();
                }
            }

        });

        ObjectAnimator animator = ObjectAnimator.ofFloat(mIcAnim, "alpha", 1f,0f,1f);
        animator.setDuration(5000);
        animator.start();
    }
}