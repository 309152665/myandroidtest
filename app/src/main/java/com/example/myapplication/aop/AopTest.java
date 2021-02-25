package com.example.myapplication.aop;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AopTest {
    private static final String TAG = "Aop";

    @Before("execution(* com.example.myapplication.MainActivity.onCreate(..))")
    public void executionActivityOnBefore(JoinPoint joinPoint){
        Log.d(TAG, joinPoint.getTarget().toString());
        Log.d(TAG, joinPoint.getSignature().getName());
    }

}
