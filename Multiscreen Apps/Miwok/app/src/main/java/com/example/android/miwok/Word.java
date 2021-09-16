package com.example.android.miwok;

public class Word {
    /** Default translation for the word*/
    private String mDefaultTranslation;

    /** Miwok translation for the word*/
    private String mMiwokTranslation;

    /** Image resource ID for the word.*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /** Get the default translation of the word.*/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the Miwok translation of the word.*/
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /** Return the image resource ID.*/
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

