#!/bin/bash

ndk-build $* \
	NDK_PROJECT_PATH=$(pwd) \
	APP_BUILD_SCRIPT=$(pwd)/Android.mk \
	NDK_OUT=$(pwd)/../../../build/native/obj \
	NDK_LIBS_OUT=$(pwd)/../../../build/native/libs
