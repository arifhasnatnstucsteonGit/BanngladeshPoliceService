package com.arifhasnat.bangladeshpoliceservice;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Online extends Activity{

	WebView wv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.online);
	
		wv=(WebView) findViewById(R.id.webViewOnline);
		wv.getSettings().setJavaScriptEnabled(true);
	
		wv.loadUrl("http://www.police.gov.bd/");
		
	}

}
