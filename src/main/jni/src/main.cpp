#include "com_aaa_bbb_MainActivity.h"

/*
 * Class:     com_aaa_bbb_MainActivity
 * Method:    nativeAdd
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_aaa_bbb_MainActivity_nativeAdd
  (JNIEnv *env, jobject obj, jint a, jint b) {
  	return a + b;
}
