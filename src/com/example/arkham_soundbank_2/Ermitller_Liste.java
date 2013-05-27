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

public class Ermitller_Liste extends ListActivity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        this.setContentView(R.layout.ermittler_list);
        
        // string ressourcen in array speichern
        // ressourcen in data.xml (res/values)
        String[] ermittler = getResources().getStringArray(R.array.ermittler);
         
        // das ressourcen array an adapeter binden
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_layout, R.id.label, ermittler));
        
        ListView lv = getListView();
        
        // onitemclicklistener an den listview klemmen
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
               
              // selected item 
              String selectedErmittler = ((TextView) view).getText().toString();
              
              Intent i = new Intent(getApplicationContext(), SingleCharacter.class);
	          // sending data to new activity
	          i.putExtra("selectedErmittler", selectedErmittler);
	          startActivity(i);
              
             
          }
        });
        
    }

}
