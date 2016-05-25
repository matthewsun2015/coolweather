package com.sunny.md5test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	static {
		System.loadLibrary("process");
	}

	private  static  final String info = "new msg";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		((TextView) findViewById(R.id.info)).setText(JNIProcess.getInfoMD5(info));
        System.out.println("JNIProcess.getInfoMD5(info)==="+JNIProcess.getInfoMD5(info));

	}
}
