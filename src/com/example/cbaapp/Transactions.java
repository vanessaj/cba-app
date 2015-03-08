package com.example.cbaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Transactions extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transactions);
		
		Bundle extras = getIntent().getExtras(); 
		int accountNum = 0;

		if (extras != null) {
		    accountNum = extras.getInt("TYPE");
		    // and get whatever type user account id is
		}
		/*
		String msg = "Num = " + accountNum;
		Toast.makeText(getApplicationContext(), msg,
				   Toast.LENGTH_LONG).show();
		*/
		
		switch (accountNum) {
        case 0:
        	setContentView(R.layout.chequing);
            return;
        case 1:
        	setContentView(R.layout.borrowing);
        	return;
        case 2:
        	setContentView(R.layout.savings);
        	return;
            }
            
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.main, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_accounts:
	        	Intent intent = new Intent(this, AccountOverview.class);
	    		startActivity(intent);
	            return true;
	        case R.id.action_bills:
	        	Intent intent2 = new Intent(this, Bills.class);
	    		startActivity(intent2);
	    		return true;
	        case R.id.action_transfer:
	        	Intent intent3 = new Intent(this, AccountTransfer.class);
	        	startActivity(intent3);
	        	return true;
	        case R.id.action_etransfer:
	        	Intent intent4 = new Intent(this, ETransfer.class);
	        	startActivity(intent4);
	        	return true;
	        case R.id.action_messages:
	        	Intent intent5 = new Intent(this, Messages.class);
	        	startActivity(intent5);
	        	return true;
	        case R.id.action_settings:
	        	Intent intent6 = new Intent(this, Settings.class);
	        	startActivity(intent6);
	        	return true;
	        case R.id.action_map:
	        	Intent intent7 = new Intent(this, Map.class);
	        	startActivity(intent7);
	        	return true;
	        case R.id.action_logout:
	        	Intent intent8 = new Intent(this, LoginPage.class);
	        	startActivity(intent8);
	        	return true;
	        default:
	        	return true;

	    }
	}
	
	
}
