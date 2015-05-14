package com.arifhasnat.bangladeshpoliceservice;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends Activity implements SearchView.OnQueryTextListener,OnItemClickListener{
	TextView tv;
	ListView lv;
	SearchView sv;
	Typeface tf;
	Intent i;
	private final String word[]=Word.word;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		tv=(TextView) findViewById(R.id.textView1);
		lv=(ListView) findViewById(R.id.listView1);
		sv=(SearchView) findViewById(R.id.searchView1);
		
		
		tf=Typeface.createFromAsset(getAssets(), "DroidSansFallback.ttf");
		tv.setTypeface(tf);
		  lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,word) );
	      lv.setTextFilterEnabled(true);
		  searchview();
		lv.setOnItemClickListener(this);
	}

	
	 private void searchview(){
	    	sv.setIconified(true);
	    	sv.setBackgroundColor(Color.WHITE);
	    	sv.setAnimationCacheEnabled(true);
	    	
	    	sv.setOnQueryTextListener(this);
	    	//sv.setSubmitButtonEnabled(true);
	    	sv.setQueryHint("Search");
	    	
	    	
	    	
	    	
	    }
	@Override
	public boolean onQueryTextChange(String newText) {
		// TODO Auto-generated method stub
		if (TextUtils.isEmpty(newText)) {
            lv.clearTextFilter();
        } else {
            lv.setFilterText(newText.toString());
        }
        return true;
    }
	

	@Override
	public boolean onQueryTextSubmit(String query) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		int position=arg2;
		switch(position){
		case 0:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 1:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 2:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 3:
			i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 4:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 5:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 6:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 7:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 8:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 9:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 10:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 11:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 12:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 13:
			i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 14:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 15:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 16:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 17:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 18:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 19:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 20:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 21:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 22:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 23:
			i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 24:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 25:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 26:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 27:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 28:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 29:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 30:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 31:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 32:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 33:
			i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 34:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 35:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 36:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 37:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 38:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 39:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 40:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 41:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 42:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 43:
			i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 44:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 45:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 46:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 47:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 48:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 49:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 50:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 51:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 52:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 53:
			i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 54:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 55:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 56:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 57:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 58:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 59:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 60:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 61:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;
		case 62:
			 i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
			
			break;	
		case 63:
			i=new Intent(MainActivity.this,Dhaka.class);
			startActivity(i);
		
			break;
		}
		
		}
		
	}

	



