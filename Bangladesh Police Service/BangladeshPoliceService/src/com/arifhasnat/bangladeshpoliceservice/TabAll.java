package com.arifhasnat.bangladeshpoliceservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabAll extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.tab);
	
	Button teacher=(Button) findViewById(R.id.teachersButton);
	Button student=(Button) findViewById(R.id.studenttabButton);
	Button google=(Button) findViewById(R.id.googlemap);
	
	TabHost th=(TabHost) findViewById(R.id.tabhost);
	th.setup();
	TabSpec specs=th.newTabSpec("Teacher");
	specs.setContent(R.id.Sevice);
	specs.setIndicator("Service");
	th.addTab(specs);
	
	
	
 specs=th.newTabSpec("Students");
	specs.setContent(R.id.Online);
	specs.setIndicator("Online");
	th.addTab(specs);
	
	
	
 specs=th.newTabSpec("About me");
	specs.setContent(R.id.InGoogeMap);
	specs.setIndicator("Google Map");
	th.addTab(specs);
	
	teacher.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Intent intent=new Intent(TabAll.this,MainActivity.class);
			startActivity(intent);
			
		}});
	
	student.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Intent intent=new Intent(TabAll.this,Online.class);
			startActivity(intent);
			
		}});
	
	google.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Intent intent=new Intent(TabAll.this,googlemap.class);
			startActivity(intent);
			
		}});
	}

	
	
	
}
