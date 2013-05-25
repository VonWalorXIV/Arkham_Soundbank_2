package com.example.arkham_soundbank_2;

public class Sound {
	
	private String mDescription = "";
	private int mSoundResourceId = -1;
	private int mIconResourceId = -1;
	
	public void setDescription(String description) { mDescription = description; }
	public String getDescription() { return mDescription; }
	public void setSoundResourceId(int id) { mSoundResourceId = id; }
	public int getSoundResourceId() { return mSoundResourceId; }
	public void setIconResourceId(int id) { mIconResourceId = id; }
	public int getIconResourceId() { return mIconResourceId; }

}
