package com.arifhasnat.bangladeshpoliceservice;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.GoogleMap;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class googlemap extends FragmentActivity{
	private static final int GPS_ERRORDIALOG_REQUEST = 9001 ;
	GoogleMap gmap;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if(service()){
			Toast.makeText(this, "google map", Toast.LENGTH_LONG).show();
			setContentView(R.layout.gpsserv);
		}else{
			setContentView(R.layout.activity_main);
		}
		
		
	}
	public boolean service(){
		int isAvailable=GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
		 if(isAvailable==ConnectionResult.SUCCESS){
			 return true;
		 }else if(GooglePlayServicesUtil.isUserRecoverableError(isAvailable)){
			 Dialog dialog=GooglePlayServicesUtil.getErrorDialog(isAvailable, this, GPS_ERRORDIALOG_REQUEST);
		 
			 dialog.show();
		 }else{
			 Toast.makeText(this, "can not",Toast.LENGTH_SHORT ).show();
		 }
		 return false;
		}

}
