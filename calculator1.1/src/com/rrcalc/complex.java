package com.rrcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class complex extends Activity implements OnClickListener{
	TextView res;
	Button p,m,mu,d;
	EditText a1,a2,b1,b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.complex);
		a1 = (EditText) findViewById(R.id.aone);
		a2 = (EditText) findViewById(R.id.atwo);
		b1 = (EditText) findViewById(R.id.bone);
		b2 = (EditText) findViewById(R.id.btwo);
		p  = (Button) findViewById(R.id.plusc);
		m  = (Button) findViewById(R.id.minusc);
		mu  = (Button) findViewById(R.id.mulc);
		d = (Button) findViewById(R.id.divc);
		res = (TextView)findViewById(R.id.resc);
		p.setOnClickListener(this);
		m.setOnClickListener(this);
		mu.setOnClickListener(this);
		d.setOnClickListener(this);

	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		

		case R.id.plusc:
			String a = a1.getText().toString();
			String b = a2.getText().toString();
			String c = b1.getText().toString();
			String d = b2.getText().toString();
			float e,f,g,h;
			e=Float.parseFloat(a);
			f=Float.parseFloat(b);
			g=Float.parseFloat(c);
			h=Float.parseFloat(d);
			e+=f;
			g+=h;
			a=String.valueOf(e);
			b=String.valueOf(g);
			res.setText(a+"+i"+b);
			break;
		case R.id.minusc:
			 a = a1.getText().toString();
			 b = a2.getText().toString();
			 c = b1.getText().toString();
			 d = b2.getText().toString();
			
			e=Float.parseFloat(a);
			f=Float.parseFloat(b);
			g=Float.parseFloat(c);
			h=Float.parseFloat(d);
			e-=f;
			g-=h;
			a=String.valueOf(e);
			b=String.valueOf(g);
			res.setText(a+"+i"+b);
			break;

		case R.id.mulc:
			 a = a1.getText().toString();
			 b = a2.getText().toString();
			 c = b1.getText().toString();
			 d = b2.getText().toString();
			
			e=Float.parseFloat(a);
			f=Float.parseFloat(b);
			g=Float.parseFloat(c);
			h=Float.parseFloat(d);
			float t,u;
			t=e*g-f*h;
			u=e*h+f*g;
			a=String.valueOf(t);
			b=String.valueOf(u);
			res.setText(a+"+i"+b);
			
			break;
		case R.id.divc:
			a = a1.getText().toString();
			 b = a2.getText().toString();
			 c = b1.getText().toString();
			 d = b2.getText().toString();
			
			e=Float.parseFloat(a);
			f=Float.parseFloat(b);
			g=Float.parseFloat(c);
			h=Float.parseFloat(d);
			t=(e*g+f*h)/(g*g+h*h);
			u=(-e*h+f*g)/(g*g+h+h);
			a=String.valueOf(t);
			b=String.valueOf(u);
			res.setText(a+"+i"+b);
			
			
			break;
	}
	
	

	}
}
