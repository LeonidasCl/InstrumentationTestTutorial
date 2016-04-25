package com.example.pc.testoftests;

import android.app.Activity;
import com.robotium.recorder.executor.Executor;

@SuppressWarnings("rawtypes")
public class MainActivityExecutor extends Executor {

	@SuppressWarnings("unchecked")
	public MainActivityExecutor() throws Exception {
		super((Class<? extends Activity>) Class.forName("com.example.pc.testoftests.MainActivity"), null, new android.R.id(), false, true, "1461485984912");
	}

	public void setUp() throws Exception { 
		super.setUp();
	}
}
