package com.example.criminalintent;

import java.util.UUID;

/**
 * Created by WangYiming on 2014/9/18.
 */
public class Crime {
    private UUID    mId;
    private String  mTitle;

    public Crime() {
        mId=UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
