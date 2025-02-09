package com.arifhasnat.bangladeshpoliceservice;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ZellandUpzila extends Activity implements OnItemSelectedListener{
	Spinner sp1,sp2;
	TextView tv;
	Typeface tf;
	String zilla[]={"Select any District","Dhaka ঢাকা সদর", 
			 "Gazipur  গাজীপুর", 
			 "Faridpur  ফরিদপুর  ","Jamalpur জামালপুর", 
			 "GopalGanj গোপালগঞ্জ", 
			 "KishorGonj কিশোরগঞ্জ", 
			 "Madaripur মাদারীপুর ","ManikGong মানিকগঞ্জ", 
			 "NarayonGanj নরায়নগঞ্জ", 
			 "MunshiGanj মুন্সিগঞ্জ", 
			 "Mymensinj ময়মনসিংহ", 
			 "Narshindi নরসিংদী", 
			 "Rajbari রাজবাড়ী", 
			 "Shariyatput শরিয়তপুর", 
			 "Sherpur শেরপুর", 
			 "Tangail টাঙ্গাইল", 


			 "Chittagonj চট্টগ্রাম সদর", 
			 "BrawhmonBaria বাহ্মনবাড়িয়া "," Chadpur চাঁদপুর", 
			 "Laxmipur লক্ষীপুর", 
			 "Comilla কুমিল্লা", 
			"Cox's Bazar কক্সবাজার", 
			"Feni ফেনী", 
			"Noakhali নোয়াখালী", 
			 "BandarBan বান্দরবান", 
			 "Rangamati রাঙ্গামাটি", 
			"Khagrachori খাগড়াছড়ি", 
			 "Rajshahi রাজশাহী সদর ",
			 "Dinajpur দিনাজপুর ",
			 "Joypur Hat জয়পুরহাট", 
			 "Bagura বগুড়া ",
			 "Chapai Nawabgonj চাপাইনবাবগঞ্জ", 
			 "KuriGram কুড়িগ্রাম ",
			 "Lalmonirhat লালমনিরহাট", 
			 "Pabna পাবনা",
			 "Nilphamari নীলফামারী ",
			 "Gaibandha গায়বান্ধা ",
			 "Panchagor পঞ্চগড়  ","Naogoan নাওগাঁ ",
			 "Naotore নাটোর ",
			 "shiraGonjসিরাজগঞ্জ", 
			 " Rangpur রংপুর ",
			 "Thakurgaon ঠাকুরগাঁও ",
			 "Netrakona নেত্রকোনা ",
			 "Khulna খুলনা সদর", 
			"Bagerhat বাগেরহাট ","Chuyadanga চুয়াডাঙ্গা",
			 "Kustia কুষ্টিয়া ",
			 "Jessor যশোর ",
			 "Jhinadah ঝিনাইদহ ",
			 "Magura মাগুরা ",
			 "Meherpur মেহেরপুর ",
			 "Naraile নড়াইল ",
			 "Shatkhira সাতক্ষীরা ",


			 "Sylet সিলেট সদর ",
			 "MowloviBazar মৌলভীবাজার", 
			 "Habigown হবিগঞ্জ ",
			 "Sunamgown সুনামগঞ্জ ",
			 "Barishal বরিশাল সদর ",
			 "Barguna বরগুনা ",
			 "Bhola ভোলা ",
			"Jhalokhathi ঝালকাঠি ",
			 "Patuakhali পটুয়াখালী", 
			 "Ferojpur ফিরোজপুর" 
	};
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
	
	String borguna[]={
		    "Amtali Upazila",
		    "Bamna Upazila",
		    "Barguna Sadar Upazila",
		    "Betagi Upazila",
		    "Patharghata Upazila",
		    "Taltali Upazila",
};
	String Barishal[]={
		    "Agailjhara Upazila",
		    "Babuganj Upazila",
		    "Bakerganj Upazila",
		    "Banaripara Upazila",
		    "Gaurnadi Upazila",
		    "Hizla Upazila",
		    "Barisal Sadar Upazila",
		    "Mehendiganj Upazila",
		    "Muladi Upazila",
		    "Wazirpur Upazila",
};
	String bhola[]={
		    "Bhola Sadar Upazila",
		    "Burhanuddin Upazila",
		    "Char Fasson Upazila",
		    "Daulatkhan Upazila",
		    "Lalmohan Upazila",
		    "Manpura Upazila",
		    "Tazumuddin Upazila",
};
	String jhalokhati[]={
		    "Jhalokati Sadar Upazila",
		    "Kathalia Upazila",
		    "Nalchity Upazila",
		    "Rajapur Upazila",
};
	String patuakhali[]={
		    "Bauphal Upazila",
		    "Dasmina Upazila",
		    "Galachipa Upazila",
		    "Kalapara Upazila",
		    "Mirzaganj Upazila",
		    "Patuakhali Sadar Upazila",
		    "Dumki Upazila.",
		    "Rangabali Upozila",
};
	String pirojpur[]={"Bhandaria ",
			"Kaukhali ",
			"Mathbaria ",
			"Nazirpur ",
			"Nesarabad",
			"Pirojpur Sada"};
	String brahmonbaria[]={"Brahmanbaria Sadar Upazila",
			"Ashuganj Upazila",
			"Nasirnagar Upazila",
			"Nabinagar Upazila",
			"Sarail Upazila",
			"Shahbazpur Town",
			"Kasba Upazila",
			"Akhaura Upazila",
			"Bancharampur Upazila",
			"Bijoynagar Upazila"};
	String Chadpur[]={"Chandpur Sadar"," Faridganj"," Haimchar", "Haziganj ","Kachua"," Matlab ","Uttar Matlab"," Dakkhin","Shahrasti"};
	String chitagong[]={

		   " Anwara Upazila",
		    "Banshkhali Upazila",
		    "Boalkhali Upazila",
		    "Chandanaish Upazila",
		    "Fatikchhari Upazila",
		    "Hathazari Upazila",
		    "Lohagara Upazila",
		    "Mirsharai Upazila",
		    "Patiya Upazila",
		    "Rangunia Upazila",
		    "Raozan Upazila",
		    "Sandwip Upazila",
		    "Satkania Upazila",
		    "Sitakunda Upazila",
            "Pahartali Thana",
		    "Panchlaish Thana",
		    "Chittagong Kotwali Thana",
		    "Chandgaon Thana",
		    "Bandar Thana",
		    "Double Mooring Thana",
		    "Halishohor Thana",
		    "Karnafuly Thana",
		    "Bakoliya Thana",
		    "Baizid Thana",
		    "Patenga Thana",
		    "Khulshi Thana",
		    "Bondor",
		    "Akbor Sha",
		    "EPZ",
		    "Chaowkbazar",
		    "jorargonj thana",
};
	String comilla[]={
		    "Barura Upazila",
		    "Brahmanpara Upazila",
		    "Burichong Upazila",
		    "Chandina Upazila",
		    "Chauddagram Upazila",
		    "Daudkandi Upazila",
		    "Debidwar Upazila",
		    "Homna Upazila",
		    "Comilla Sadar Upazila",
		    "Laksam Upazila",
		    "Monohorgonj Upazila",
		    "Meghna Upazila",
		    "Muradnagar Upazila",
		    "Nangalkot Upazila",
		    "Comilla Sadar South Upazila",
		    "Titas Upazila",
};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zilla);
		tv=(TextView) findViewById(R.id.textView1);
		tf=Typeface.createFromAsset(getAssets(), "DroidSansFallback.ttf");
		tv.setTypeface(tf);
		sp1=(Spinner) findViewById(R.id.spinner1);
		sp2=(Spinner) findViewById(R.id.spinner2);
		ArrayAdapter<String> zillas=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,zilla);
		ArrayAdapter<String> dhakas=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,dhaka);
		sp1.setAdapter(zillas);
		sp2.setAdapter(dhakas);
		sp1.setOnItemSelectedListener(this);
		sp2.setOnItemSelectedListener(this);
	}
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		AlertDialog.Builder builder =new AlertDialog.Builder(ZellandUpzila.this);
		switch(sp1.getSelectedItemPosition()){
	case 1://first batch
			
			
			switch(sp2.getSelectedItemPosition()){
			
			case 0:

				//builder.setMessage("hey !"+yourName +" you are  in "+values+"%"+"love with "+gfName +" Its very low . Are you actually in Love?? ");
				
				
				
				break;
				
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
				
				
				
				
				AlertDialog alert=builder.create();
				alert.show();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;	
			
			case 12:
				break;
			case 13:
				break;
			case 14:
				break;
			case 15:
				break;
			case 16:
				break;
			case 17:
				break;
			case 18:
				break;
			case 19:
				break;
			case 20:
				break;
			case 21:
				break;
			case 22:
				break;
			case 23:
				break;
			case 24:
				break;
			case 25:
				break;
			case 26:
				break;
			case 27:
				break;
			case 28:
				break;
			case 29:
				break;
			case 30:
				break;
			}
			
			
			
			
			break;
		
	case 2://second batch
			break;
		}
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
