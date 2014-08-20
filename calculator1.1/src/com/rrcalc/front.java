package com.rrcalc;




import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class front extends ListActivity {

	/**
	 * @param args
	 */
	String[] classes = {"Standard","Mathematical","Complex","Equation"};

		@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(front.this, android.R.layout.simple_list_item_checked, classes));

	}
		protected void onListItemClick(ListView l, View v, int position, long id) {
			// TODO Auto-generated method stub
			super.onListItemClick(l, v, position, id);
			
			switch (position)
			{
			case 0:
				Class myclass;
				try {
					myclass = Class.forName("com.rrcalc.simple");
				
				Intent myint = new Intent(front.this, myclass);
				startActivity(myint);	}
				catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 1:
				Class myclass2;
				try {
					myclass2 = Class.forName("com.rrcalc.lands");
				
				Intent myint = new Intent(front.this, myclass2);
				startActivity(myint);	}
				catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				Class myclass3;
				try {
					myclass = Class.forName("com.rrcalc.complex");
				
				Intent myint = new Intent(front.this, myclass);
				startActivity(myint);	}
				catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				break;
			case 3:
				
				
				break;

			}
		}
}
