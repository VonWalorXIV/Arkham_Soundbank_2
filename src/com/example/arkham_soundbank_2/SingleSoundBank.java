package com.example.arkham_soundbank_2;


import java.util.ArrayList;

import com.example.arkham_soundbank_2.R;
import com.example.arkham_soundbank_2.Sound;
import com.example.arkham_soundbank_2.SoundAdapter;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SingleSoundBank extends ListActivity{
	
	private ArrayList<Sound> mSounds = null;
	private SoundAdapter mAdapter = null;
	static MediaPlayer mMediaPlayer = null;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_sound_bank_view);
        
        String [] selected;
        
        Intent i = getIntent();
        // getting attached intent data
        String selectedBank = i.getStringExtra("selectedBank");
        
        
        //SWITCH CASE Anweisung wäre wahrscheinlich besser
        if (selectedBank.equals("Monster")){
        	
        	//create a simple list
            mSounds = new ArrayList<Sound>();
            Sound s = new Sound();
            s.setDescription("Hound of Tindalos");
    		s.setIconResourceId(R.drawable.houndoftindalos);
            s.setSoundResourceId(R.raw.dog);
            mSounds.add(s);
            s = new Sound();
            s.setDescription("Cultist");
            s.setIconResourceId(R.drawable.cultist);
            s.setSoundResourceId(R.raw.wilhelmscream);
            mSounds.add(s);
            s = new Sound();
            s.setDescription("Byakhee");
            s.setIconResourceId(R.drawable.byakhee);
            s.setSoundResourceId(R.raw.kitten);
            mSounds.add(s);
            
            mAdapter = new SoundAdapter(this, R.layout.list_row, mSounds);
            setListAdapter(mAdapter);
        	
        	/*
        	// string ressourcen in array speichern
            selected = getResources().getStringArray(R.array.monsters);
            
            // ressourcen array an adapter klemmen
            this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_layout, R.id.label, selected));
            */
        }
        else if (selectedBank.equals("Ermittler")){
        	
        	//create a simple list
            mSounds = new ArrayList<Sound>();
            Sound s = new Sound();
            s.setDescription("Jenny Barnes");
    		s.setIconResourceId(R.drawable.jennybarnes);
            s.setSoundResourceId(R.raw.jennybarnes);
            mSounds.add(s);
            s = new Sound();
            s.setDescription("Ashcan Pete");
            s.setIconResourceId(R.drawable.ashcanpete);
            s.setSoundResourceId(R.raw.ashcanpete);
            mSounds.add(s);
            s = new Sound();
            s.setDescription("William Yorick");
            s.setIconResourceId(R.drawable.williamyorick);
            s.setSoundResourceId(R.raw.williamyorick);
            mSounds.add(s);
            
            mAdapter = new SoundAdapter(this, R.layout.list_row, mSounds);
            setListAdapter(mAdapter);
        	
            /*
        	// string ressourcen in array speichern
            selected = getResources().getStringArray(R.array.ermittler);
            
            // ressourcen array an adapter klemmen
            this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_layout, R.id.label, selected));
            */
        }
        else if (selectedBank.equals("Waffen")){
        	
        	//create a simple list
            mSounds = new ArrayList<Sound>();
            Sound s = new Sound();
            s.setDescription(".45 Automatik");
    		s.setIconResourceId(R.drawable.automatik45);
            s.setSoundResourceId(R.raw.gunfire);
            mSounds.add(s);
            s = new Sound();
            s.setDescription("Shotgun BOOM");
            s.setIconResourceId(R.drawable.shotgun);
            s.setSoundResourceId(R.raw.shotgun);
            mSounds.add(s);
            s = new Sound();
            s.setDescription("FLammenwerfer");
            s.setIconResourceId(R.drawable.flamethrower);
            s.setSoundResourceId(R.raw.flamethrower);
            mSounds.add(s);
            
            mAdapter = new SoundAdapter(this, R.layout.list_row, mSounds);
            setListAdapter(mAdapter);
        	
            /*
        	// string ressourcen in array speichern
            selected = getResources().getStringArray(R.array.waffen);
            
            // ressourcen array an adapter klemmen
            this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_layout, R.id.label, selected));
            */
        }
        
     
        /* 
         * ALTER CODE
         * 
        //TextView txtProduct = (TextView) findViewById(R.id.product_label);        
        // displaying selected product name
        //txtProduct.setText(selectedBank);        
        
        ListView lv = getListView();
        
     // onitemclick listerner für neue listview
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
              // do something here
             
          }
        });
        
        
        //list = neueListe.getListView();
         * 
         */      
         
    }
	
	@Override
    public void onListItemClick(ListView parent, View v, int position, long id){
    	Sound s = (Sound) mSounds.get(position);
    	MediaPlayer mp = MediaPlayer.create(this, s.getSoundResourceId());
    	mp.start();
    }

}

