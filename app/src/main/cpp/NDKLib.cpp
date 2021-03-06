//
// Created by Administrator on 2020/9/17.
//

#include <jni.h>
#include "com_example_myapplication_jni_JniTools.h"
#include "MathTest.h"
#include <android/log.h>

using namespace _MATH;

static const char* kTAG = "native-lib";

#define LOGI(...) \
    __android_log_print(ANDROID_LOG_INFO, kTAG, __VA_ARGS__)

extern "C" JNIEXPORT jint JNICALL Java_com_example_myapplication_jni_JniTools_addNum
(JNIEnv *, jobject, jint num1, jint num2){
    LOGI("调用相加 : num1: %d  , num2 :%d" , num1 , num2);
    return add(num1 , num2);
}

extern "C" JNIEXPORT jlong JNICALL Java_com_example_myapplication_jni_JniTools_init
        (JNIEnv *, jobject){
    auto *p = new Person();
    p->setAge(5);
    return (jlong)p;
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_myapplication_jni_JniTools_getPersonAge(JNIEnv *env, jobject thiz, jlong _native) {
    auto *p = (Person *)_native;
    return p->getAge();
}