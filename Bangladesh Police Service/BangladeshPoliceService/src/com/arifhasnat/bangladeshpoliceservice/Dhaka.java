package com.arifhasnat.bangladeshpoliceservice;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Dhaka extends Activity implements OnItemSelectedListener{
	
	String dhaka[]={
			"select anyone",
		    "Dhamrai Upazila (ধামরাই উপজেলা), suburuban and rural",
		    "Dohar Upazila (দোহার উপজেলা), suburban and rural",
		    "Keraniganj Upazila (কেরানীগঞ্জ উপজেলা), suburban",
		    "Nawabganj Upazila (নবাবগঞ্জ উপজেলা), suburban and rural",
		    "Savar Upazila (সাভার উপজেলা), suburban",
            "Badda (বাড্ডা থানা)",
		    "Biman Bandar (বিমান বন্দর থানা)",
		    "Cantonment (ক্যান্টনমেন্ট থানা)",
		    "Dhanmondi (ধানমন্ডি থানা)",
		    "Demra (ডেমরা থানা)",
		    "Kotwali (কোতয়ালী থানা)",
		    "Gulshan (গুলশান থানা)",
		    "Hazaribagh (হাজারীবাগ থানা)",
		    "Kafrul (কাফরুল থানা)",
		    "Kamringir Char (কামরাঙ্গীর চর থানা)",
		    "Khilgaon (খিলগাঁও থানা)",
		    "Lalbagh (লালবাগ থানা)",
		    "Mugda (মুগদা থানা)",
		    "Mirpur (মিরপুর থানা)",
		    "Mohammadpur (মোহাম্মদপুর থানা)",
		    "Motijheel (মতিঝিল থানা)",
		    "Pallabi (পল্লবী থানা)",
		    "Paltan",
		    "Ramna (রমনা থানা)",
		    "Sabujbagh (সবুজবাগ থানা)",
		    "Shyampur (শ্যামপুর থানা)",
		    "Sutrapur (সুত্রাপুর থানা)",
		    "Tejgaon (তেজগাঁও থানা)",
		    "Uttara (উত্তরা থানা)",
};
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.dhaka);
	Spinner sp1=(Spinner) findViewById(R.id.dhakaSpinner);
	ArrayAdapter<String> dhakas=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,dhaka);
	sp1.setAdapter(dhakas);
	sp1.setOnItemSelectedListener(this);
}

@Override
public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
	AlertDialog.Builder builder =new AlertDialog.Builder(Dhaka.this);
	AlertDialog alert;
	int position=arg2;
	switch(position){
	case 1:
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
		
	case 2:
	
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 3:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 4:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 5:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;  
	case 6:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 7:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 8:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 9:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 10:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 11:
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
		
	case 12:
	
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 13:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 14:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 15:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;  
	case 16:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 17:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 18:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 19:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 20:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
		
	case 21:
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
		
	case 22:
	
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 23:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 24:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 25:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;  
	case 26:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 27:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 28:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 29:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	case 30:
		
		builder.setMessage("OC PHone no: 01735009800 offic email: dhakapolice@gmail.com");
		builder.setCancelable(false);
		builder.setTitle("Information");
		builder.setPositiveButton("back", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				
			}
		});
	   builder.setNegativeButton("CALL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Intent intent=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:+8801823024498"));
				startActivity(intent);
				
			}
		});
		
		
		
		
		alert=builder.create();
		alert.show();
		break;
	}
	
}
@Override
public void onNothingSelected(AdapterView<?> arg0) {
	// TODO Auto-generated method stub
	
}


}
