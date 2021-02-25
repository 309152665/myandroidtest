package com.example.myapplication.jni;

public class JniTools {

    private long _native = -1;

    static{
        System.loadLibrary("native-lib");
    }

    public void _init(){
        _native = init();
        System.out.print(_native);
    }

    public int _getPersonAge(){
        return getPersonAge(_native);
    }

    public native int addNum(int num1,int num2);

    public native long init();

    public native int getPersonAge(long _native);
}
