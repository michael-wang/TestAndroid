LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := test

LOCAL_SRC_FILES := $(LOCAL_PATH)/src/main.cpp

include $(BUILD_SHARED_LIBRARY)
