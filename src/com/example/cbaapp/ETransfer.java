package com.example.cbaapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ETransfer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_etransfer);
		
		Spinner spinnerEtran = (Spinner) findViewById(R.id.etran_bills_spinner);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapterEtran = ArrayAdapter.createFromResource(this,
		        R.array.accounts_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapterEtran.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinnerEtran.setAdapter(adapterEtran);
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
	
	public void etranClick(View view){
		EditText amount = (EditText) findViewById(R.id.amountInputETrans);
		amount.setText("");
		
		EditText rep = (EditText) findViewById(R.id.etran_r_input);
		rep.setText("");
		
		EditText question = (EditText) findViewById(R.id.etran_q_input);
		question.setText("");
		
		EditText email = (EditText) findViewById(R.id.etran_input_email);
		email.setText("");
		
		Toast toast= Toast.makeText(getApplicationContext(), 
				"Succès!", Toast.LENGTH_LONG);  
				toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0, 0);
				toast.show();
	}
}
