package com.example.android.miwok.java.com.example.android.miwok;

/**
 * Created by Kubra on 12.11.2016.
 */

public class Word {
    private String turkishWord,englishWord;
    private static final int NO_IMAGE=-1;
    private int imageId=NO_IMAGE;

    public int getImageId() {
        return imageId;
    }


    public String getEnglishWord() {
        return englishWord;
    }

    public String getTurkishWord() {
        return turkishWord;
    }

    public Word(String tW,String eW){
        turkishWord=tW;
        englishWord=eW;

    }
    public Word(String tW,String eW,int imId){
        turkishWord=tW;
        englishWord=eW;
        imageId=imId;
    }
public boolean hasImage(){
    return imageId!=NO_IMAGE;
}

}
