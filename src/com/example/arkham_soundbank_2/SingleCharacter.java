package com.example.arkham_soundbank_2;


import android.os.Bundle;
import android.widget.ImageView;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.widget.Button;

public class SingleCharacter extends Activity implements View.OnClickListener{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        this.setContentView(R.layout.single_character_layout);
        
        Intent i = getIntent();
        // getting attached intent data
        String selectedErmittler = i.getStringExtra("selectedErmittler");
        
        if(selectedErmittler.equals("Aschan Pete")){
        	
	        ImageView portrait = (ImageView)findViewById(R.id.portrait);
	        portrait.setImageResource(R.drawable.ashcanpete);
	        
	        TextView beschreibung = (TextView)findViewById(R.id.beschreibung);
	        beschreibung.setText(selectedErmittler);
	        
	        Button screamButton = (Button)findViewById(R.id.btnErmittlerScream);
	        screamButton.setOnClickListener(this);
	        Button tauntButton = (Button)findViewById(R.id.btnErmittlerTaunt);
	        tauntButton.setOnClickListener(this);
        
        }
        else if(selectedErmittler.equals("Jenny Barnes")){
        	
	        ImageView portrait = (ImageView)findViewById(R.id.portrait);
	        portrait.setImageResource(R.drawable.jennybarnes);
	        
	        TextView beschreibung = (TextView)findViewById(R.id.beschreibung);
	        beschreibung.setText(selectedErmittler);
	        
	        Button screamButton = (Button)findViewById(R.id.btnErmittlerScream);
	        screamButton.setOnClickListener(this);
	        Button tauntButton = (Button)findViewById(R.id.btnErmittlerTaunt);
	        tauntButton.setOnClickListener(this);
        
        }
        else if(selectedErmittler.equals("William Yorick")){
        	
	        ImageView portrait = (ImageView)findViewById(R.id.portrait);
	        portrait.setImageResource(R.drawable.williamyorick);
	        
	        TextView beschreibung = (TextView)findViewById(R.id.beschreibung);
	        beschreibung.setText(selectedErmittler);
	        
	        Button screamButton = (Button)findViewById(R.id.btnErmittlerScream);
	        screamButton.setOnClickListener(this);
	        Button tauntButton = (Button)findViewById(R.id.btnErmittlerTaunt);
	        tauntButton.setOnClickListener(this);
        
        }
        
        
	}
	
	public void onClick(View v) {
		MediaPlayer player = null;
		switch(v.getId()) {
	        case R.id.btnErmittlerScream:
	        	player = MediaPlayer.create(this, R.raw.williamyorick);
	        	player.start();
	        // mediaplayer benutzen
	        break;
	        case R.id.btnErmittlerTaunt:
	        	player = MediaPlayer.create(this, R.raw.ashcanpete);
	        	player.start();
	        // mediaplayer benutzen
	        break;
		}
		
	}
	
}
