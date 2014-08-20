package com.rrcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class simple extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,per,eq,clear,allclear;
	TextView dis;
	String num1="init",num2="init";
	int flag=0; 
	String op = "no";
    @Override

    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1 = (Button) findViewById(R.id.one);
        b2 = (Button) findViewById(R.id.two);
        b3 = (Button) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.five);
        b6 = (Button) findViewById(R.id.six);
        b7 = (Button) findViewById(R.id.seven);
        b8 = (Button) findViewById(R.id.eight);
        b9 = (Button) findViewById(R.id.nine);
        b0 = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.plus);
        sub = (Button) findViewById(R.id.minus);
        mul = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        per = (Button) findViewById(R.id.perc);
        eq = (Button) findViewById(R.id.eq);
        clear = (Button) findViewById(R.id.clear);
        allclear = (Button) findViewById(R.id.allclear);

        
        dis = (TextView) findViewById(R.id.display);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b4.setOnClickListener(this);
        b3.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        per.setOnClickListener(this);
        eq.setOnClickListener(this);
        clear.setOnClickListener(this);
        allclear.setOnClickListener(this);

        
        
        
    }
public void onClick(View v) {
	switch(v.getId())
	{
	case R.id.zero:
		addstring(flag,"0");		
		break;
	case R.id.one:
		addstring(flag,"1");
		break;
	case R.id.two:
		addstring(flag,"2");
		break;
	case R.id.three:
		addstring(flag,"3");
		break;
	case R.id.four:
		addstring(flag,"4");
		break;
	case R.id.five:
		addstring(flag,"5");
		break;
	case R.id.six:
		addstring(flag,"6");
		break;
	case R.id.seven:
		addstring(flag,"7");
		break;
	case R.id.eight:
		addstring(flag,"8");
		break;
	case R.id.nine:
		addstring(flag,"9");
		break;
	case R.id.plus:
		if(flag==0)
		{
			flag=1;
			op="+";
			dis.setText("+");
		}
		else 
		{
			float ans;
			ans = solve(num1,num2,op);
			num1=String.valueOf(ans);
			num2="init";
			op="+";
			dis.setText(num1);
		}
		break;
	case R.id.minus:
		if(flag==0)
		{
			flag=1;
			op="-";
			dis.setText("-");
		}
		else 
		{
			float ans;
			ans = solve(num1,num2,op);
			num1=String.valueOf(ans);
			num2="init";
			op="-";
			dis.setText(num1);
		}
		break;
		
	case R.id.mult:
		if(flag==0)
		{
			flag=1;
			op="*";
			dis.setText("*");
		}
		else 
		{
			float ans;
			ans = solve(num1,num2,op);
			num1=String.valueOf(ans);
			num2="init";
			op="*";
			dis.setText(num1);
		}
		break;
		
	case R.id.div:
		if(flag==0)
		{
			flag=1;
			op="/";
			dis.setText("/");
		}
		else 
		{
			float ans;
			ans = solve(num1,num2,op);
			num1=String.valueOf(ans);
			num2="init";
			op="/";
			dis.setText(num1);
		}
		break;
	case R.id.clear:
		
		break;
	case R.id.allclear:
		num1 = "init";
		num2 = "init";
		op = "no ";
		dis.setText("");
		
		break;
	case R.id.perc:
		
		break;
	case R.id.eq:
		float ans;
		ans = solve(num1,num2,op);
		num1 = String.valueOf(ans);
		num2 = "init";
		op="no";
		dis.setText(num1);
		flag = 0;
	}
}
private float solve(String num12, String num22, String op2) {
	// TODO Auto-generated method stub
	float a,b;
	a=Float.parseFloat(num12);
	b=Float.parseFloat(num22);
	if(op2.contentEquals("+"))
		a=a+b;
	else if(op2.contentEquals("-"))
		a=a-b;
	else if(op2.contentEquals("*"))
		a=a*b;
	else if(op2.contentEquals("/"))
		a=a/b;
	return a;
}
public void addstring(int f,String s) 
{
	if(f==0)
	{
		if(num1.contentEquals("init"))
			num1 = s;
		else
			num1=num1+s;
		dis.setText(num1);
	}
	else
	{
		if(num2.contentEquals("init"))
			num2 = s;
		else
			num2=num2+s;
		dis.setText(num2);
	}
}
	
	
}
   
