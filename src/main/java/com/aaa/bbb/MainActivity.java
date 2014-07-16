package com.aaa.bbb;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		int answer = nativeAdd(1, 2);

		TextView tv = (TextView)findViewById(R.id.textview);
		tv.setText("1 + 2 = " + Integer.toString(answer));

		Log.w("TestAndroid", "answer:" + answer + ",tv:" + tv);
	}

	static {
		System.loadLibrary("test");
	}

	private native int nativeAdd(int a, int b);
}
