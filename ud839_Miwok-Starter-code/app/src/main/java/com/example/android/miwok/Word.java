package com.example.android.miwok;

/**
 * Created by Ashwin Nayak on 13-02-2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResorceId;

    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResorceId=imageResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getmImageResorceId(){
        return mImageResorceId;
    }
}

