package com.example.android.project8;

/**
 * Created by Manik on 17-04-2017.
 */

public class News {

    private String mTitle;
    private String mSection;
    private String mUrl;

    public News(String Title, String sectionName,String url) {
        mTitle = Title;
        mSection = sectionName;
        mUrl=url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }
    public String getUrl(){ return mUrl; }
}
