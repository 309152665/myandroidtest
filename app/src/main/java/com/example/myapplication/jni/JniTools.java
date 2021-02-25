package com.example.myapplication.jni;

public class JniTools {
    static{
        System.loadLibrary("native-lib");
    }

    public native int addNum(int num1,int num2);
}
