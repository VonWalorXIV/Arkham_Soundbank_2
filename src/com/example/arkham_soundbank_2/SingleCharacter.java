package com.example.arkham_soundbank_2;


import android.os.Bundle;
import android.widget.ImageView;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class SingleCharacter extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        this.setContentView(R.layout.single_character_layout);
        
        ImageView portrait = (ImageView)findViewById(R.id.portrait);
        portrait.setImageResource(R.drawable.ashcanpete);
        
        TextView beschreibung = (TextView)findViewById(R.id.beschreibung);
        beschreibung.setText("Ashcan Pete");
        
        
        
	}
	
}
