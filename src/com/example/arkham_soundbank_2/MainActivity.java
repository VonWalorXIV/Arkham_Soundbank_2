package com.example.arkham_soundbank_2;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.app.Activity;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends ListActivity {

	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        // string ressourcen in array speichern
        // ressourcen in data.xml (res/values)
        String[] sound_boards = getResources().getStringArray(R.array.sound_boards);
         
        // das ressourcen array an adapeter binden
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_layout, R.id.label, sound_boards));
        
        ListView lv = getListView();
        
        // onitemclicklistener an den listview klemmen
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
               
              // selected item 
              String selectedBank = ((TextView) view).getText().toString();
              
              if (!selectedBank.equals("TestAnsicht")){
            	  // Launching new Activity on selecting single List Item
            	  Intent i = new Intent(getApplicationContext(), SingleSoundBank.class);
	              // sending data to new activity
	              i.putExtra("selectedBank", selectedBank);
	              startActivity(i);
              }
              else{
            	  Intent i = new Intent(getApplicationContext(), SingleCharacter.class);
	              // sending data to new activity
	              i.putExtra("selectedBank", selectedBank);
	              startActivity(i);
              }
             
          }
        });
        
    }
	
	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 * 
	 * Hier wurde Menü erstellt, das knallte dann bei Klick auf einen Menüeintrag
	 * also erstmal wieder rausgenommen
	 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.options_menu, menu);
		return true;
	}

	
	 * This method will be called any time a user selects one of the options
	 * on the menu. For the implementation, whichever button is clicked is
	 * mapped onto the relevant activity.
	 * @param item MenuItem
	 * @return boolean
	 
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case R.id.preferences:
				startActivity(new Intent(this, EditPreferences.class));
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
	
	*/
	
}