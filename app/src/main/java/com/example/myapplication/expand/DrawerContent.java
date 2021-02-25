package com.example.myapplication.expand;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.drawerlayout.widget.DrawerLayout;

public class DrawerContent extends MotionLayout implements  DrawerLayout.DrawerListener{
    public DrawerContent(@NonNull Context context) {
        super(context , null);
    }

    public DrawerContent(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs , 0);
    }

    public DrawerContent(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
        setProgress(slideOffset);
    }

    @Override
    public void onDrawerOpened(@NonNull View drawerView) {

    }

    @Override
    public void onDrawerClosed(@NonNull View drawerView) {

    }

    @Override
    public void onDrawerStateChanged(int newState) {

    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if(getParent() instanceof DrawerLayout){
            ((DrawerLayout)getParent()).addDrawerListener(this);
        }
    }
}
