package com.Tugas.kebudayaanjambi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	
	}
	public void openPakaian(View k){
		Intent a = new Intent(getApplicationContext(),PakaianActivity.class);
		startActivity(a);
	}
    public void openRumah(View l){
		Intent b = new Intent(getApplicationContext(),RumahActivity.class);
		startActivity(b);
	}
    public void openTarian(View x){
		Intent c = new Intent(getApplicationContext(),TarianActivity.class);
		startActivity(c);
    }
	public void openSenjata(View r){
		Intent d = new Intent(getApplicationContext(),SenjataActivity.class);
		startActivity(d);
	  }
		public void openMakanan(View s){
			Intent e = new Intent(getApplicationContext(),MakananActivity.class);
			startActivity(e);
		}
		public void openLagu(View t){
			Intent f = new Intent(getApplicationContext(),LaguActivity.class);
			startActivity(f);
		}
		public void openWisata(View u){
			Intent g = new Intent(getApplicationContext(),WisataActivity.class);
			startActivity(g);
		}
		public void openPahlawan(View v){
			Intent h = new Intent(getApplicationContext(),PahlawanActivity.class);
			startActivity(h);



	}
}
