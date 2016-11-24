package com.example.ridhwaan.criminal;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Ridhwaan on 11/11/16.
 */

public class Crime {


    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public Crime() {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }
    public String getFormattedDate(){
        String dateFormatted = DateFormat.getDateInstance().format(mDate);
        return dateFormatted;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public UUID getmID() {
        return mID;


    }

}
