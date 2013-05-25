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
               
              // Launching new Activity on selecting single List Item
              Intent i = new Intent(getApplicationContext(), SingleSoundBank.class);
              // sending data to new activity
              i.putExtra("selectedBank", selectedBank);
              startActivity(i);
             
          }
        });
        
    }
}