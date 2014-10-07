package com.example.startactivityforresult;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends Activity 
{
    TextView  tv;
    Button b;

    
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity1);
		
		// get The reference of The textView and button
		tv=(TextView)findViewById(R.id.textView);
		b=(Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				  Intent i=new Intent(Activity1.this,Activity2.class);
				  startActivityForResult(i, 2);// Activity is started with requestCode 2
			}
		});
	}
	
	// Call Back method  to get the Name form other Activity2
	@Override
	   protected void onActivityResult(int requestCode, int resultCode, Intent data)
	   {
   	      super.onActivityResult(requestCode, resultCode, data);
   	      
   	       // check if the request code is same as what is passed  here it is 2
             if(requestCode==2)
   	         {
            	 if(null!=data)
            	 {	 	
            		 // fetch the message String
            		 String name=data.getStringExtra("key_name"); 
            		 // Set the message string in textView
            		 tv.setText("Your Name is : " + name);
            	 }
   	         }
     }
}
