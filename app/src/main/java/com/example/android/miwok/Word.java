package com.example.android.miwok;

/**
 * Created by leonardo on 11/09/2016.
 */
public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private int image = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int musicId;

    public Word(String defaultTranslation, String miwokTranslation, int music){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.musicId = music;
    }

    public Word(String defaultTranslation, String miwokTranslation, int image, int music){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.image = image;
        this.musicId = music;

    }

    public String getDefaultTranslation(){
        return this.defaultTranslation;
    }

    public String getMiwokTranslation(){
        return this.miwokTranslation;
    }

    public int getImage(){
        return this.image;
    }

    public boolean hasImage() {
        return image != NO_IMAGE_PROVIDED;
    }

    public int getMusicId(){
        return this.musicId;
    }

}
