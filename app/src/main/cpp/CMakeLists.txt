
cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PROJECT_SOURCE_DIR}/jniLibs/${ANDROID_ABI})

add_library(native-lib SHARED NDKLib.cpp )

target_link_libraries(native-lib
        android
        log)