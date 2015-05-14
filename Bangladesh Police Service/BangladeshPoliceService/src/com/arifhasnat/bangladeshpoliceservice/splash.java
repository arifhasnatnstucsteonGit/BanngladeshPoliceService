package com.arifhasnat.bangladeshpoliceservice;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class splash extends Activity{
	MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        mp=MediaPlayer.create(getBaseContext(), R.raw.theme);
	
        mp.start();
        Thread th=new Thread(){
        	
        	public void run(){
        		try{
        			sleep(5000);
        			
        		}catch(InterruptedException e){
        			e.printStackTrace();
        			
        		}finally{
        			Intent intent1 =new Intent(splash.this,TabAll.class);
        			startActivity(intent1);
        			mp.stop();
        		}
        		
        		
        		
        		
        	}
        	
        
        	
        	
        };
		th.start();
	
	
	
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	} 

	
}
