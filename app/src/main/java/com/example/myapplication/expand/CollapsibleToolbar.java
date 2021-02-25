/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.myapplication.expand;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;

import com.google.android.material.appbar.AppBarLayout;

class CollapsibleToolbar extends MotionLayout implements AppBarLayout.OnOffsetChangedListener {

    public CollapsibleToolbar(@NonNull Context context) {
        super(context , null);
    }

    public CollapsibleToolbar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs , 0);
    }

    public CollapsibleToolbar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        setProgress(-verticalOffset / Float.valueOf(appBarLayout.getTotalScrollRange()));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(getParent() instanceof AppBarLayout){
            ((AppBarLayout)getParent()).addOnOffsetChangedListener(this);
        }
    }

    //    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
//        progress = -verticalOffset / appBarLayout?.totalScrollRange?.toFloat()!!
//    }
//
//    override fun onAttachedToWindow() {
//        super.onAttachedToWindow()
//        (parent as? AppBarLayout)?.addOnOffsetChangedListener(this)
//    }
}