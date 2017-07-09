package com.example.android.newsapp;

/**
 * Created by Lukas on 2017-07-09.
 */

public class News {

    private String mTitle;
    private String mSelection;
    private String mDate;
    private String mUrl;


    public News(String Title, String Selection, String Date, String Url) {
        mTitle = Title;
        mSelection = Selection;
        mDate = Date;
        mUrl = Url;
    }


    public String getTitle() {
        return mTitle;
    }

    public String getSelection() {
        return mSelection;
    }

    public String getDate() {
        return mDate;
    }


    public String getUrl() {
        return mUrl;
    }

}
