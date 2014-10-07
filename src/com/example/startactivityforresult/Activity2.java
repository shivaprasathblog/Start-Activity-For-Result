package com.example.startactivityforresult;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends Activity 
{
    EditText  et;
    Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		// Get the reference of Edit Text
		et=(EditText)findViewById(R.id.editText);
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				String name=et.getText().toString();
				
				Intent i=new Intent();
				
				// put the name in Intent
				i.putExtra("key_name",name);
				// Set The Result in Intent
				setResult(2,i);
				// finish The activity 
		        finish();
			}
		});
	}
	
}